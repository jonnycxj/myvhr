package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.SysMsgPojo;
import com.jgds.hrserver.pojo.SysMsgPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMsgPojoMapper {
    int countByExample(SysMsgPojoExample example);

    int deleteByExample(SysMsgPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMsgPojo record);

    int insertSelective(SysMsgPojo record);

    List<SysMsgPojo> selectByExample(SysMsgPojoExample example);

    SysMsgPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMsgPojo record, @Param("example") SysMsgPojoExample example);

    int updateByExample(@Param("record") SysMsgPojo record, @Param("example") SysMsgPojoExample example);

    int updateByPrimaryKeySelective(SysMsgPojo record);

    int updateByPrimaryKey(SysMsgPojo record);
}