package com.onlineplatform.proincorruptiblealliance.mapper;

import com.onlineplatform.proincorruptiblealliance.entity.ModularDict;
import com.onlineplatform.proincorruptiblealliance.entity.ModularDictExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ModularDictMapper {
    long countByExample(ModularDictExample example);

    int deleteByExample(ModularDictExample example);

    int deleteByPrimaryKey(Integer modularId);

    int insert(ModularDict record);

    int insertSelective(ModularDict record);

    List<ModularDict> selectByExample(ModularDictExample example);

    ModularDict selectByPrimaryKey(Integer modularId);

    int updateByExampleSelective(@Param("record") ModularDict record, @Param("example") ModularDictExample example);

    int updateByExample(@Param("record") ModularDict record, @Param("example") ModularDictExample example);

    int updateByPrimaryKeySelective(ModularDict record);

    int updateByPrimaryKey(ModularDict record);

    @Select("select * from modular_dict")
    List<ModularDict> selectAll();
}