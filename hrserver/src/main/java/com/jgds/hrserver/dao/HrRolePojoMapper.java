package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.HrRolePojo;
import com.jgds.hrserver.pojo.HrRolePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrRolePojoMapper {
    int countByExample(HrRolePojoExample example);

    int deleteByExample(HrRolePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrRolePojo record);

    int insertSelective(HrRolePojo record);

    List<HrRolePojo> selectByExample(HrRolePojoExample example);

    HrRolePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrRolePojo record, @Param("example") HrRolePojoExample example);

    int updateByExample(@Param("record") HrRolePojo record, @Param("example") HrRolePojoExample example);

    int updateByPrimaryKeySelective(HrRolePojo record);

    int updateByPrimaryKey(HrRolePojo record);
}