package com.vip.demo.manager;

import com.vip.demo.pojo.Blog;
import com.vip.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogManager {
    @Autowired
    private BlogService blogService;

    public Blog getBlogById(String id) {
        return blogService.getBlogById(id);
    }

    public void insertBlog(Blog blog){
        blogService.insertBlog(blog);
    }
}
