package com.lc.college.dao;

import com.lc.entity.Staff;

import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
public interface StaffDao {
    public List<String> findAllName();

    public String findIdByName(String staffId);

    public List<Staff> findAll();

    void add(Staff staff);
}
