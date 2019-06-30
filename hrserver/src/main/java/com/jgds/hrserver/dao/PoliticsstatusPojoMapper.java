package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.PoliticsstatusPojo;
import com.jgds.hrserver.pojo.PoliticsstatusPojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PoliticsstatusPojoMapper {
    int countByExample(PoliticsstatusPojoExample example);

    int deleteByExample(PoliticsstatusPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsstatusPojo record);

    int insertSelective(PoliticsstatusPojo record);

    List<PoliticsstatusPojo> selectByExample(PoliticsstatusPojoExample example);

    PoliticsstatusPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoliticsstatusPojo record, @Param("example") PoliticsstatusPojoExample example);

    int updateByExample(@Param("record") PoliticsstatusPojo record, @Param("example") PoliticsstatusPojoExample example);

    int updateByPrimaryKeySelective(PoliticsstatusPojo record);

    int updateByPrimaryKey(PoliticsstatusPojo record);
}