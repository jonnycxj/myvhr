package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.EmployeeremovePojo;
import com.jgds.hrserver.pojo.EmployeeremovePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeremovePojoMapper {
    int countByExample(EmployeeremovePojoExample example);

    int deleteByExample(EmployeeremovePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeremovePojo record);

    int insertSelective(EmployeeremovePojo record);

    List<EmployeeremovePojo> selectByExample(EmployeeremovePojoExample example);

    EmployeeremovePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeremovePojo record, @Param("example") EmployeeremovePojoExample example);

    int updateByExample(@Param("record") EmployeeremovePojo record, @Param("example") EmployeeremovePojoExample example);

    int updateByPrimaryKeySelective(EmployeeremovePojo record);

    int updateByPrimaryKey(EmployeeremovePojo record);
}