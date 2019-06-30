package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.MenuRolePojo;
import com.jgds.hrserver.pojo.MenuRolePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuRolePojoMapper {
    int countByExample(MenuRolePojoExample example);

    int deleteByExample(MenuRolePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuRolePojo record);

    int insertSelective(MenuRolePojo record);

    List<MenuRolePojo> selectByExample(MenuRolePojoExample example);

    MenuRolePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenuRolePojo record, @Param("example") MenuRolePojoExample example);

    int updateByExample(@Param("record") MenuRolePojo record, @Param("example") MenuRolePojoExample example);

    int updateByPrimaryKeySelective(MenuRolePojo record);

    int updateByPrimaryKey(MenuRolePojo record);
}