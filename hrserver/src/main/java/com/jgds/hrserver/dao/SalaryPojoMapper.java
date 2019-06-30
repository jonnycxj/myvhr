package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.SalaryPojo;
import com.jgds.hrserver.pojo.SalaryPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SalaryPojoMapper {
    int countByExample(SalaryPojoExample example);

    int deleteByExample(SalaryPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SalaryPojo record);

    int insertSelective(SalaryPojo record);

    List<SalaryPojo> selectByExample(SalaryPojoExample example);

    SalaryPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SalaryPojo record, @Param("example") SalaryPojoExample example);

    int updateByExample(@Param("record") SalaryPojo record, @Param("example") SalaryPojoExample example);

    int updateByPrimaryKeySelective(SalaryPojo record);

    int updateByPrimaryKey(SalaryPojo record);
}