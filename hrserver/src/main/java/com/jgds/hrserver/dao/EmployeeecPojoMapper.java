package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.EmployeeecPojo;
import com.jgds.hrserver.pojo.EmployeeecPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeecPojoMapper {
    int countByExample(EmployeeecPojoExample example);

    int deleteByExample(EmployeeecPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeecPojo record);

    int insertSelective(EmployeeecPojo record);

    List<EmployeeecPojo> selectByExample(EmployeeecPojoExample example);

    EmployeeecPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeecPojo record, @Param("example") EmployeeecPojoExample example);

    int updateByExample(@Param("record") EmployeeecPojo record, @Param("example") EmployeeecPojoExample example);

    int updateByPrimaryKeySelective(EmployeeecPojo record);

    int updateByPrimaryKey(EmployeeecPojo record);
}