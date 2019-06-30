package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.EmpSalaryPojo;
import com.jgds.hrserver.pojo.EmpSalaryPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpSalaryPojoMapper {
    int countByExample(EmpSalaryPojoExample example);

    int deleteByExample(EmpSalaryPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalaryPojo record);

    int insertSelective(EmpSalaryPojo record);

    List<EmpSalaryPojo> selectByExample(EmpSalaryPojoExample example);

    EmpSalaryPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpSalaryPojo record, @Param("example") EmpSalaryPojoExample example);

    int updateByExample(@Param("record") EmpSalaryPojo record, @Param("example") EmpSalaryPojoExample example);

    int updateByPrimaryKeySelective(EmpSalaryPojo record);

    int updateByPrimaryKey(EmpSalaryPojo record);
}