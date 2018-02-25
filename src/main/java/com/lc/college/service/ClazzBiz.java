package com.lc.college.service;

import com.lc.entity.custom.DeptAndSpec;

import java.util.List;

/**
 * Created by lc on 16-2-11.
 */
public interface ClazzBiz {
    public void add(String deptName, String specName, String year);

    public void delete(int clazzId);

    public List<Class> findAll();

    public List<DeptAndSpec> findDeptAndSpec();

    public String findDeptAndSpecJson();

    public List<String> findDeptNameList();
}
