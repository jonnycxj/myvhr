package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.DepartmentPojo;
import com.jgds.hrserver.pojo.DepartmentPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentPojoMapper {
    int countByExample(DepartmentPojoExample example);

    int deleteByExample(DepartmentPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentPojo record);

    int insertSelective(DepartmentPojo record);

    List<DepartmentPojo> selectByExample(DepartmentPojoExample example);

    DepartmentPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DepartmentPojo record, @Param("example") DepartmentPojoExample example);

    int updateByExample(@Param("record") DepartmentPojo record, @Param("example") DepartmentPojoExample example);

    int updateByPrimaryKeySelective(DepartmentPojo record);

    int updateByPrimaryKey(DepartmentPojo record);
}