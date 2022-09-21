package com.msy.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msy.plus.mapper.SysPermissionMapper;
import com.msy.plus.entity.SysPermission;
import com.msy.plus.service.PermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @author MoShuYing
* @date 2021/05/14
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionServiceImpl extends ServiceImpl<SysPermissionMapper,SysPermission> implements PermissionService {


}
