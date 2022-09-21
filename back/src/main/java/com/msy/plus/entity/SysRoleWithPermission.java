package com.msy.plus.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysRoleWithPermission extends SysRole {
    List<SysPermission> sysPermissions;
}
