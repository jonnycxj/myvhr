package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.JObLevelPojo;
import com.jgds.hrserver.pojo.JObLevelPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JObLevelPojoMapper {
    int countByExample(JObLevelPojoExample example);

    int deleteByExample(JObLevelPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JObLevelPojo record);

    int insertSelective(JObLevelPojo record);

    List<JObLevelPojo> selectByExample(JObLevelPojoExample example);

    JObLevelPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JObLevelPojo record, @Param("example") JObLevelPojoExample example);

    int updateByExample(@Param("record") JObLevelPojo record, @Param("example") JObLevelPojoExample example);

    int updateByPrimaryKeySelective(JObLevelPojo record);

    int updateByPrimaryKey(JObLevelPojo record);
}