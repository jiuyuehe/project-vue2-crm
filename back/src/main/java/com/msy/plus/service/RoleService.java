package com.msy.plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msy.plus.dto.RoleDTO;
import com.msy.plus.entity.SysRole;
import com.msy.plus.entity.RoleRefPermission;
import com.msy.plus.entity.SysRoleWithPermission;

import java.util.List;

/**
 * @author MoShuying
 * @date 2018/05/27
 */
public interface RoleService extends IService<SysRole> {
  /**
   * 赋予默认角色给账户
   *
   * @param accountId 账户Id
   */
  void saveAsDefaultRole(Long accountId);

  /**
   * 保存角色
   *
   * @param roleDTO 角色传输实体
   */
  void saveDTO(RoleDTO roleDTO);

  /**
   * 更新角色
   *
   * @param roleDTO 角色传输实体
   */
  void updateDTO(RoleDTO roleDTO);

  /**
   * 获取角色信息并查询角色权限
   * @param id
   * @return
   */
  SysRoleWithPermission getDetailById(Long id);

  /**
   * 保存用户权限
   * @param permissions
   */
  void savePermissions(Long roleId,List<Long> permissions);

  /**
   * 删除中间表信息
   * @param roleId
   * @param permissionId
   */
  void deleteRolePermissionItem(Long roleId,Long permissionId);

  /**
   * 获取所有权限表中的字段
   * @param roleId
   * @return List<RolePermissionDO>
   */
  List<RoleRefPermission> getAllRolePermissionTableRow(Long roleId);
}
