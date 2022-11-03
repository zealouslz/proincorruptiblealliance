package com.onlineplatform.proincorruptiblealliance.mapper;

import com.onlineplatform.proincorruptiblealliance.dto.UpdateItem;
import com.onlineplatform.proincorruptiblealliance.entity.Item;
import com.onlineplatform.proincorruptiblealliance.entity.ItemExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    long countByExample(ItemExample example);

    int deleteByExample(ItemExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(Item record);

    int insertSelective(Item record);

    List<Item> selectByExample(ItemExample example);

    Item selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
    @Insert("insert into item (item_id, item_name, create_date," +
            "creator_name, creator_id, html_content," +
            "belong_type, belong_modular,serial_no)" +
            "values (#{item.itemId,jdbcType=VARCHAR}, #{item.itemName,jdbcType=VARCHAR}, #{item.createDate,jdbcType=TIMESTAMP}," +
            "#{item.creatorName,jdbcType=VARCHAR}, #{item.creatorId,jdbcType=VARCHAR}, #{item.htmlContent,jdbcType=VARCHAR}," +
            "#{item.belongType,jdbcType=INTEGER}, #{item.belongModular,jdbcType=INTEGER},#{item.serialNo,jdbcType=INTEGER})")
    int insertItem(@Param("item") Item item);

    @Select("select * from item where belong_modular=#{modular} and belong_type=#{type} order by serial_no ")
    List<Item> selectByModularAndType(@Param("modular")int modular,@Param("type")int type);

    @Select("select * from item where belong_modular=#{modular} and belong_type=#{type} order by serial_no limit 5 ")
    List<Item> selectByModularAndTypeLimit5(@Param("modular")int modular,@Param("type")int type);

    @Select({"<script>","select * from item where belong_modular=#{modualr} and belong_type=#{type}"+
            "<if test='itemName!= null and itemName!=\"\"'>  and item_name like '%${itemName}%' </if>" +
            "<if test='date!= null and date!=\"\"'> and create_date = #{date,jdbcType=DATE} </if>" +
            "order by serial_no ","</script>"})
    List<Item> searchList(@Param("modualr") int modualr, @Param("type") int type, @Param("date") String date, @Param("itemName") String itemName);

    @Update("update item set serial_no=#{serialNo} where item_id = #{itemId,jdbcType=VARCHAR}")
    int updateSerialNo(@Param("itemId") String itemId,@Param("serialNo") int serialNo);

    @Delete("delete from item where item_id = #{itemId,jdbcType=VARCHAR}")
    int deleteById(@Param("itemId")String itemId);

    @Update("update item set item_name=#{item.itemName},html_content = #{item.htmlContent,jdbcType=VARCHAR}"+
            "where item_id = #{item.itemId,jdbcType=VARCHAR}")
    int updateById(@Param("item") UpdateItem item);
}