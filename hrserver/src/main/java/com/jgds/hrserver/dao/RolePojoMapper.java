package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.RolePojo;
import com.jgds.hrserver.pojo.RolePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePojoMapper {
    int countByExample(RolePojoExample example);

    int deleteByExample(RolePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePojo record);

    int insertSelective(RolePojo record);

    List<RolePojo> selectByExample(RolePojoExample example);

    RolePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePojo record, @Param("example") RolePojoExample example);

    int updateByExample(@Param("record") RolePojo record, @Param("example") RolePojoExample example);

    int updateByPrimaryKeySelective(RolePojo record);

    int updateByPrimaryKey(RolePojo record);
}