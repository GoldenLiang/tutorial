package com.lc.college.dao;

import com.lc.entity.Spec;
import com.lc.entity.custom.DeptAndSpec;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lc on 16-2-11.
 */
public interface SpecDao {
    public List<Spec> findAll();

    public void update(@Param("specName") String specName, @Param("newSpecName") String newSpecName);

    public void add(Spec spec);

    public void delete(String specName);

    public List<DeptAndSpec> findDeptAndSpec();

    public String findIdByName(String specName);

    public List<String> findAllSpecName();
}
