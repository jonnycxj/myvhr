package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.EmployeePojo;
import com.jgds.hrserver.pojo.EmployeePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeePojoMapper {
    int countByExample(EmployeePojoExample example);

    int deleteByExample(EmployeePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeePojo record);

    int insertSelective(EmployeePojo record);

    List<EmployeePojo> selectByExample(EmployeePojoExample example);

    EmployeePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeePojo record, @Param("example") EmployeePojoExample example);

    int updateByExample(@Param("record") EmployeePojo record, @Param("example") EmployeePojoExample example);

    int updateByPrimaryKeySelective(EmployeePojo record);

    int updateByPrimaryKey(EmployeePojo record);
}