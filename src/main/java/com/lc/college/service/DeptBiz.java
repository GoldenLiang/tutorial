package com.lc.college.service;

import com.lc.entity.custom.DeptAndSpec;
import com.lc.entity.Dept;

import java.util.List;

/**
 * Created by lc on 16-2-11.
 */
public interface DeptBiz {
    public List<Dept> findAll();

    public void add(String deptName);

    public void update(Dept dept);

    public void delete(int deptId);

}
