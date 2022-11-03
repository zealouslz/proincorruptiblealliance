package com.onlineplatform.proincorruptiblealliance.mapper;

import com.onlineplatform.proincorruptiblealliance.entity.File;
import com.onlineplatform.proincorruptiblealliance.entity.FileExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface FileMapper {
    long countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(File record);

    int insertSelective(File record);

    List<File> selectByExampleWithBLOBs(FileExample example);

    List<File> selectByExample(FileExample example);

    File selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExampleWithBLOBs(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKeyWithBLOBs(File record);

    int updateByPrimaryKey(File record);

    @Insert("insert into file (file_id, file_name, belong_item_id,content)" +
            "values (#{file.fileId,jdbcType=VARCHAR}, #{file.fileName,jdbcType=VARCHAR}, #{file.belongItemId,jdbcType=VARCHAR}," +
            "#{file.content,jdbcType=LONGVARBINARY})")
    int addNewFile(@Param("file") File file);

    @Delete("delete from file where belong_item_id=#{itemId}")
    int deleteByItemId(@Param("itemId")String itemId);
}