package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.PositionPojo;
import com.jgds.hrserver.pojo.PositionPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionPojoMapper {
    int countByExample(PositionPojoExample example);

    int deleteByExample(PositionPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PositionPojo record);

    int insertSelective(PositionPojo record);

    List<PositionPojo> selectByExample(PositionPojoExample example);

    PositionPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PositionPojo record, @Param("example") PositionPojoExample example);

    int updateByExample(@Param("record") PositionPojo record, @Param("example") PositionPojoExample example);

    int updateByPrimaryKeySelective(PositionPojo record);

    int updateByPrimaryKey(PositionPojo record);
}