package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.OpLogPojo;
import com.jgds.hrserver.pojo.OpLogPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OpLogPojoMapper {
    int countByExample(OpLogPojoExample example);

    int deleteByExample(OpLogPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpLogPojo record);

    int insertSelective(OpLogPojo record);

    List<OpLogPojo> selectByExample(OpLogPojoExample example);

    OpLogPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpLogPojo record, @Param("example") OpLogPojoExample example);

    int updateByExample(@Param("record") OpLogPojo record, @Param("example") OpLogPojoExample example);

    int updateByPrimaryKeySelective(OpLogPojo record);

    int updateByPrimaryKey(OpLogPojo record);
}