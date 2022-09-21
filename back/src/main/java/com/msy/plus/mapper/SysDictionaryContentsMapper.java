package com.msy.plus.mapper;

import com.msy.plus.core.mapper.MyMapper;
import com.msy.plus.entity.SysDictionaryContents;

import java.util.List;

public interface SysDictionaryContentsMapper extends MyMapper<SysDictionaryContents> {
    List<SysDictionaryContents> listWithKeyword(String keyword);
}