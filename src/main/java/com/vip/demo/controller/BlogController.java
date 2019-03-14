package com.vip.demo.controller;

import com.vip.demo.manager.BlogManager;
import com.vip.demo.pojo.Blog;
import com.vip.demo.pojo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/blog/")
public class BlogController {

    @Autowired
    private BlogManager blogManager;

    @RequestMapping("/article")
    public JsonResult getBlog(String id, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        Blog blog = blogManager.getBlogById(id);
        return JsonResult.ok(blog);
    }

    @RequestMapping("/insert")
    public JsonResult insertBlog(String title, String content, HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blogManager.insertBlog(blog);
        return JsonResult.ok();
    }
}
