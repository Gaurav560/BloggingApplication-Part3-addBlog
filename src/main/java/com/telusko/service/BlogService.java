package com.telusko.service;

import com.telusko.model.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> getAllBlogs();

    Blog getBlogById(int id);

    Blog addBlog(Blog blog);
}
