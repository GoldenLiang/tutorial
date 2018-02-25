package com.lc.college.dao;

import com.lc.entity.Student;

import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
public interface StudentDao {
    public List<Student> findAll();

    public void add(Student student);

    public void update(Student student);

    public void delete(int studentId);
}
