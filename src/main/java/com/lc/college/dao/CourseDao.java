package com.lc.college.dao;

import com.lc.entity.Course;

import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
public interface CourseDao {
    public List<Course> findAll();

    public void add(Course course);

    public void delete(String courseTitle);

    public List<String> findAllCourseTitle();
}
