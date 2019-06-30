package com.jgds.hrserver.dao;

import com.jgds.hrserver.pojo.HrPojo;
import com.jgds.hrserver.pojo.HrPojoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface HrPojoMapper {
    int countByExample(HrPojoExample example);

    int deleteByExample(HrPojoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrPojo record);

    int insertSelective(HrPojo record);

    List<HrPojo> selectByExample(HrPojoExample example);

    HrPojo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrPojo record, @Param("example") HrPojoExample example);

    int updateByExample(@Param("record") HrPojo record, @Param("example") HrPojoExample example);

    int updateByPrimaryKeySelective(HrPojo record);

    int updateByPrimaryKey(HrPojo record);

    HrPojo loadUserByUsername(String username);
}