package com.lion.community.mapper;


import com.lion.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(name,account_id,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
//    如果形参是类的时候，就是可以直接写#{field},而如果是单个字段就需要加param
    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token")String token);
}
