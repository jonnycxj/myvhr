package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.AdjustsalaryPojo;
import com.jgds.hrserver.pojo.AdjustsalaryPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdjustsalaryPojoMapper {
    int countByExample(AdjustsalaryPojoExample example);

    int deleteByExample(AdjustsalaryPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdjustsalaryPojo record);

    int insertSelective(AdjustsalaryPojo record);

    List<AdjustsalaryPojo> selectByExample(AdjustsalaryPojoExample example);

    AdjustsalaryPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdjustsalaryPojo record, @Param("example") AdjustsalaryPojoExample example);

    int updateByExample(@Param("record") AdjustsalaryPojo record, @Param("example") AdjustsalaryPojoExample example);

    int updateByPrimaryKeySelective(AdjustsalaryPojo record);

    int updateByPrimaryKey(AdjustsalaryPojo record);
}