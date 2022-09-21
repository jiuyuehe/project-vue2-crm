package com.msy.plus.mapper;

import com.msy.plus.core.mapper.MyMapper;
import com.msy.plus.entity.SysDictionaryContents;
import com.msy.plus.entity.SysDictionaryDetails;

import java.util.List;

public interface SysDictionaryDetailsMapper extends MyMapper<SysDictionaryDetails> {
    List<SysDictionaryContents> listWithKeyword(int id, String keyword);

}