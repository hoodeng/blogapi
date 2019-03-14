package com.vip.demo.service;

import com.vip.demo.dao.BlogDao;
import com.vip.demo.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;

    public Blog getBlogById(String id) {
//        Blog blog = new Blog();
//        blog.setTitle("标题" + id);
//        blog.setContent("内容");
//        return blog;
        return blogDao.queryBlog(id);
    }

    public void insertBlog(Blog blog){
        blogDao.insertBlog(blog);
    }
}
