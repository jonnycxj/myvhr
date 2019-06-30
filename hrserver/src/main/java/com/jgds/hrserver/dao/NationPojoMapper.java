package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.NationPojo;
import com.jgds.hrserver.pojo.NationPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NationPojoMapper {
    int countByExample(NationPojoExample example);

    int deleteByExample(NationPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NationPojo record);

    int insertSelective(NationPojo record);

    List<NationPojo> selectByExample(NationPojoExample example);

    NationPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NationPojo record, @Param("example") NationPojoExample example);

    int updateByExample(@Param("record") NationPojo record, @Param("example") NationPojoExample example);

    int updateByPrimaryKeySelective(NationPojo record);

    int updateByPrimaryKey(NationPojo record);
}