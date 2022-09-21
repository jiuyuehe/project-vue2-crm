package com.msy.plus.mapper;

import com.msy.plus.core.mapper.MyMapper;
import com.msy.plus.dto.AnalysisQuery;
import com.msy.plus.entity.Analysis;
import com.msy.plus.entity.Customer;
import com.msy.plus.dto.CustomerManagerList;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CustomerManagerMapper extends MyMapper<Customer> {
    List<CustomerManagerList> listAllWithDictionary(String keyword,Integer status);
    Customer getDetailById(Object id);
    List<Analysis> queryAnalysis(AnalysisQuery analysisQuery);
}