package com.msy.plus.service.impl;

import com.msy.plus.entity.SysDictionaryContents;
import com.msy.plus.mapper.SysDictionaryDetailsMapper;
import com.msy.plus.entity.SysDictionaryDetails;
import com.msy.plus.service.DictionaryDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author MoShuYing
* @date 2021/05/18
*/
@Service
@Transactional(rollbackFor = Exception.class)
public class DictionaryDetailsServiceImpl extends AbstractService<SysDictionaryDetails> implements DictionaryDetailsService {
    @Resource
    private SysDictionaryDetailsMapper sysDictionaryDetailsMapper;

    @Override
    public List<SysDictionaryContents> listWithKeyword(int id, String keyword) {
        return sysDictionaryDetailsMapper.listWithKeyword(id,keyword);
    }
}
