package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.EmployeetrainPojo;
import com.jgds.hrserver.pojo.EmployeetrainPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeetrainPojoMapper {
    int countByExample(EmployeetrainPojoExample example);

    int deleteByExample(EmployeetrainPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeetrainPojo record);

    int insertSelective(EmployeetrainPojo record);

    List<EmployeetrainPojo> selectByExample(EmployeetrainPojoExample example);

    EmployeetrainPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeetrainPojo record, @Param("example") EmployeetrainPojoExample example);

    int updateByExample(@Param("record") EmployeetrainPojo record, @Param("example") EmployeetrainPojoExample example);

    int updateByPrimaryKeySelective(EmployeetrainPojo record);

    int updateByPrimaryKey(EmployeetrainPojo record);
}