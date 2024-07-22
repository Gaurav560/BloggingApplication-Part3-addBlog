package com.telusko.service;

import com.telusko.model.Blog;
import com.telusko.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepo blogRepo;

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepo.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        return blogRepo.findById(id).orElseThrow(() -> new RuntimeException("Blog not found with id " + id));
    }

    @Override
    public Blog addBlog(Blog blog) {
        return blogRepo.save(blog);
    }
}
