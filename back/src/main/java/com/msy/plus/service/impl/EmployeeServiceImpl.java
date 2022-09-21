package com.msy.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msy.plus.entity.EmployeeDetail;
import com.msy.plus.entity.EmployeeWithRoleDO;
import com.msy.plus.entity.User;
import com.msy.plus.mapper.UserMapper;
import com.msy.plus.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author MoShuYing
* @date 2021/05/15
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl extends ServiceImpl<UserMapper,User> implements EmployeeService {


    @Resource
    private UserMapper userMapper;

    @Override
    public EmployeeDetail getDetailById(Long id) {
        return this.userMapper.getDetailById(id);
    }

    @Override
    public List<EmployeeWithRoleDO> listEmployeeWithRole(String keyword,Integer dept){
        if(dept==null){ dept=0; }
        return this.userMapper.listEmployeeWithRole(keyword,dept);
    }

    @Override
    public void saveRoles(Long id, List<Long> roles) {
        this.userMapper.saveRoles(id,roles);
    }

    @Override
    public int deleteEmployeeWithRole(Long id) {
        return this.userMapper.deleteEmployeeWithRole(id);
    }

    @Override
    public int deleteEmployeeWithRoleItem(Long id, Long roleId) {
        return this.userMapper.deleteEmployeeWithRoleItem(id,roleId);
    }

    @Override
    public List<Long> getAllEmployeeRoleTableRow(Long id) {
        return this.userMapper.getAllEmployeeRoleTableRow(id);
    }
}
