package com.msy.plus.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msy.plus.core.response.Result;
import com.msy.plus.core.response.ResultGenerator;
import com.msy.plus.dto.SysRoleWithPermissionDTO;
import com.msy.plus.entity.SysRole;
import com.msy.plus.entity.RoleRefPermission;
import com.msy.plus.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * 角色控制器
 *
 * @author MoShuying
 * @date 2018/05/27
 */
//@PreAuthorize("hasAuthority('ADMIN')")
@Api(tags={"角色接口"})
@RestController
@RequestMapping("/role")
public class RoleController {
  @Resource private RoleService roleService;

  @Operation(description = "角色添加")
  @PostMapping
  public Result add(@RequestBody final SysRoleWithPermissionDTO roleDTO) {
    if(roleDTO.getSysPermissions()==null){
      return ResultGenerator.genFailedResult("尚未添加角色权限");
    }
    try{
      this.roleService.save(roleDTO);
    }catch (DuplicateKeyException e){
      return ResultGenerator.genFailedResult("提交的信息中包含已存在的字段");
    }
    List<Long> temp = new ArrayList<>();
    roleDTO.getSysPermissions().forEach(e->{ temp.add(e.getId()); });
    this.roleService.savePermissions(roleDTO.getId(),temp);
    return ResultGenerator.genOkResult();
  }

  @Operation(description = "角色删除")
  @DeleteMapping("/{id}")
  public Result delete(@PathVariable final Long id) {
    List<RoleRefPermission> raw = this.roleService.getAllRolePermissionTableRow(id);
    for(RoleRefPermission e :raw){
      this.roleService.deleteRolePermissionItem(id,e.getPermission_id());
    }
    this.roleService.removeById(id);
    return ResultGenerator.genOkResult();
  }

  @Operation(description = "角色更新")
  @PutMapping
  public Result update(@RequestBody final SysRoleWithPermissionDTO roleWithPermissionDTO) {
    // 更新用户基本信息
    this.roleService.updateDTO(roleWithPermissionDTO);
    List<Long> nowPermissions = new ArrayList<>();
    if(roleWithPermissionDTO.getSysPermissions()==null){
      return ResultGenerator.genOkResult();
    }

    List<RoleRefPermission> rawPer = this.roleService.getAllRolePermissionTableRow(roleWithPermissionDTO.getId());
    // 表中权限信息去重
    Set<Long> raw = new HashSet<>();
    for(RoleRefPermission e: rawPer){
      raw.add(e.getPermission_id());
    }

    roleWithPermissionDTO.getSysPermissions().forEach(e->{ nowPermissions.add(e.getId()); });

    // diff运算
    Set<Long> adds = new HashSet<>();
    Set<Long> removes = new HashSet<>();

    // 如果修改后的不包含原来的 那么为新增元素
    for(Long i:nowPermissions){
      if(!raw.contains(i)){
        adds.add(i);
      }
    }

    // 如果原来的不包含修改后的 那么是删除元素
    for(Long i:raw){
      if(!nowPermissions.contains(i)){
        removes.add(i);
      }
    }

    if(!adds.isEmpty()){
        this.roleService.savePermissions(roleWithPermissionDTO.getId(),new ArrayList<>(adds));
    }
    if(!removes.isEmpty()){
      removes.forEach(e->{
        this.roleService.deleteRolePermissionItem(roleWithPermissionDTO.getId(),e);
      });
    }
    return ResultGenerator.genOkResult();
  }
  @Operation(description = "角色详情")
  @GetMapping("/{id}")
  public Result detail(@PathVariable final Long id) {
    final SysRole role = this.roleService.getDetailById(id);
    return ResultGenerator.genOkResult(role);
  }

  @Operation(description = "角色列表")
  @GetMapping
  @ApiOperation(value="分页查询角色", notes="分页查询角色列表")
  @ApiImplicitParams({
          @ApiImplicitParam(name = "page", value = "第几页", required = true, dataType = "Integer", paramType="query"),
          @ApiImplicitParam(name = "size", value = "一页有几条", required = true, dataType = "Integer", paramType="query")
  })
  public Result list(
      @RequestParam(defaultValue = "1") final Integer page,
      @RequestParam(defaultValue = "10") final Integer size) {
    PageHelper.startPage(page, size);
    final List<SysRole> list = this.roleService.list();
    final PageInfo<SysRole> pageInfo = new PageInfo<>(list);
    return ResultGenerator.genOkResult(pageInfo);
  }
}
