package com.msy.plus.service.impl;

import com.msy.plus.entity.UserDepartment;
import com.msy.plus.mapper.UserDepartmentMapper;
import com.msy.plus.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @author MoShuYing
* @date 2021/05/12
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl extends AbstractService<UserDepartment> implements DepartmentService {
    @Resource
    private UserDepartmentMapper userDepartmentMapper;

}
