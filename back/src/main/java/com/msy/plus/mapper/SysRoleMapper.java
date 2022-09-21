package com.msy.plus.mapper;

import com.msy.plus.core.mapper.MyMapper;
import com.msy.plus.entity.SysRole;
import com.msy.plus.entity.RoleRefPermission;
import com.msy.plus.entity.SysRoleWithPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MoShuying
 * @date 2018/07/15
 */
public interface SysRoleMapper extends MyMapper<SysRole> {
  /**
   * 赋予默认角色给账户
   *
   * @param accountId 账户Id
   * @return 影响行数
   */
  int saveAsDefaultRole(@Param("accountId") Long accountId);

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
  int savePermissions(Long roleId,List<Long> permissions);

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
