package com.lc.college.service;

import com.lc.entity.Course;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
public interface CourseBiz {
    public List<Course> findAll();

    public List<String> findAllSpecName();

    public void add(Course course);

    public void delete(String courseTitle);
}
