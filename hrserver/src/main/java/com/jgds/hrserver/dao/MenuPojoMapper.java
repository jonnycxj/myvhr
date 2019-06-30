package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.MenuPojo;
import com.jgds.hrserver.pojo.MenuPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuPojoMapper {
    int countByExample(MenuPojoExample example);

    int deleteByExample(MenuPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuPojo record);

    int insertSelective(MenuPojo record);

    List<MenuPojo> selectByExample(MenuPojoExample example);

    MenuPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenuPojo record, @Param("example") MenuPojoExample example);

    int updateByExample(@Param("record") MenuPojo record, @Param("example") MenuPojoExample example);

    int updateByPrimaryKeySelective(MenuPojo record);

    int updateByPrimaryKey(MenuPojo record);
}