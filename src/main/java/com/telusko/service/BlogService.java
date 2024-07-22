package com.telusko.service;

import com.telusko.model.Blog;

import java.util.List;

public interface BlogService {

    public List<Blog> getAllBlogs();

    public Blog getBlogById(int id);

    public Blog addBlog(Blog blog);
}
