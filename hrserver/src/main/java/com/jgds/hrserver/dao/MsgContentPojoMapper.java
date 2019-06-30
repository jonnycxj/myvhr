package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.MsgContentPojo;
import com.jgds.hrserver.pojo.MsgContentPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsgContentPojoMapper {
    int countByExample(MsgContentPojoExample example);

    int deleteByExample(MsgContentPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgContentPojo record);

    int insertSelective(MsgContentPojo record);

    List<MsgContentPojo> selectByExample(MsgContentPojoExample example);

    MsgContentPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MsgContentPojo record, @Param("example") MsgContentPojoExample example);

    int updateByExample(@Param("record") MsgContentPojo record, @Param("example") MsgContentPojoExample example);

    int updateByPrimaryKeySelective(MsgContentPojo record);

    int updateByPrimaryKey(MsgContentPojo record);
}