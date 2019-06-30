package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.AppraisePojo;
import com.jgds.hrserver.pojo.AppraisePojoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppraisePojoMapper {
    int countByExample(AppraisePojoExample example);

    int deleteByExample(AppraisePojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppraisePojo record);

    int insertSelective(AppraisePojo record);

    List<AppraisePojo> selectByExample(AppraisePojoExample example);

    AppraisePojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppraisePojo record, @Param("example") AppraisePojoExample example);

    int updateByExample(@Param("record") AppraisePojo record, @Param("example") AppraisePojoExample example);

    int updateByPrimaryKeySelective(AppraisePojo record);

    int updateByPrimaryKey(AppraisePojo record);
}