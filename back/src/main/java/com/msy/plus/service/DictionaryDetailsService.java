package com.msy.plus.service;

import com.msy.plus.entity.SysDictionaryContents;
import com.msy.plus.entity.SysDictionaryDetails;

import java.util.List;

/**
* @author MoShuYing
* @date 2021/05/18
*/
public interface DictionaryDetailsService extends com.baomidou.mybatisplus.extension.service.IService<SysDictionaryDetails> {
    List<SysDictionaryContents> listWithKeyword(int id, String keyword);
}
