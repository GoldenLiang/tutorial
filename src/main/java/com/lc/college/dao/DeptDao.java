package com.lc.college.dao;

import com.lc.entity.custom.DeptAndSpec;
import com.lc.entity.Dept;

import java.util.List;

/**
 * Created by lc on 16-2-10.
 */
public interface DeptDao {
    public List<Dept> findAll();

    public void add(String deptName);

    public String findIdByName(String deptName);

    public void update(Dept dept);

    public void delete(int deptId);

    public List<String> findAllDeptName();

}
