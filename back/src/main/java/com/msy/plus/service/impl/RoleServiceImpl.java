package com.msy.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msy.plus.core.response.ResultCode;
import com.msy.plus.dto.RoleDTO;
import com.msy.plus.entity.SysRole;
import com.msy.plus.entity.RoleRefPermission;
import com.msy.plus.entity.SysRoleWithPermission;
import com.msy.plus.mapper.SysRoleMapper;
import com.msy.plus.service.RoleService;
import com.msy.plus.util.AssertUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author MoShuying
 * @date 2018/05/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements RoleService {

  @Resource private SysRoleMapper sysRoleMapper;

  @Override
  public void saveAsDefaultRole(final Long accountId) {
    final boolean success = this.sysRoleMapper.saveAsDefaultRole(accountId) == 1;
    AssertUtils.asserts(success, ResultCode.SAVE_FAILED, "账户默认角色保存失败");
  }

  @Override
  public void saveDTO(final RoleDTO roleDTO) {
    final SysRole role = roleDTO.convertToDO();
    this.save(role);
  }

  @Override
  public void updateDTO(final RoleDTO roleDTO) {
    final SysRole role = roleDTO.convertToDO();
    this.saveOrUpdate(role);
  }

  @Override
  public SysRoleWithPermission getDetailById(Long id) {
    return this.sysRoleMapper.getDetailById(id);
  }

  @Override
  public void savePermissions(Long roleId,List<Long> permissions) {
    this.sysRoleMapper.savePermissions(roleId,permissions);
//    AssertUtils.asserts(success, ResultCode.SAVE_FAILED, "账户角色权限保存失败");
  }

  @Override
  public void deleteRolePermissionItem(Long roleId, Long permissionId) {
    this.sysRoleMapper.deleteRolePermissionItem(roleId,permissionId);
  }

  @Override
  public List<RoleRefPermission> getAllRolePermissionTableRow(Long roleId) {
    return this.sysRoleMapper.getAllRolePermissionTableRow(roleId);
  }
}
