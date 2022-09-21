package com.msy.plus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msy.plus.entity.SysDictionaryContents;

import java.util.List;

/**
* @author MoShuYing
* @date 2021/05/18
*/
public interface DictionaryContentsService extends IService<SysDictionaryContents> {


    List<SysDictionaryContents>  listWithKeyword(String keyword);
}
