package com.onlineplatform.proincorruptiblealliance.mapper;

import com.onlineplatform.proincorruptiblealliance.entity.LianmengType;
import com.onlineplatform.proincorruptiblealliance.entity.LianmengTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LianmengTypeMapper {
    long countByExample(LianmengTypeExample example);

    int deleteByExample(LianmengTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(LianmengType record);

    int insertSelective(LianmengType record);

    List<LianmengType> selectByExample(LianmengTypeExample example);

    LianmengType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") LianmengType record, @Param("example") LianmengTypeExample example);

    int updateByExample(@Param("record") LianmengType record, @Param("example") LianmengTypeExample example);

    int updateByPrimaryKeySelective(LianmengType record);

    int updateByPrimaryKey(LianmengType record);

    @Select("select * from lianmeng_type where belong_modular=#{modularId}")
    List<LianmengType> selectByModularId(@Param("modularId") Integer modularId);
}