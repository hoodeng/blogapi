package com.vip.demo.dao;

import com.vip.demo.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BlogDao {
    @Select("select * from t_blog where id = #{id}")
    Blog queryBlog(String id);

    @Insert("insert into t_blog (title, content) VALUES (#{c.title},#{c.content})")
    void insertBlog(@Param("c") Blog blog);
}
