package com.lc.college.service;

import com.lc.entity.Spec;
import com.lc.entity.custom.DeptAndSpec;

import java.util.List;

/**
 * Created by lc on 16-2-11.
 */
public interface SpecBiz {

    public void update(String specName, String newSpecName);

    public void add(Spec spec);

    public void delete(String specName);

    public List<DeptAndSpec> findDeptAndSpec();

    public List<String> findDpet();
}
