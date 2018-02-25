package com.lc.college.service.impl;

import com.lc.college.dao.DeptDao;
import com.lc.college.service.DeptBiz;
import com.lc.entity.custom.DeptAndSpec;
import com.lc.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lc on 16-2-11.
 */

@Service
public class DeptBizImpl implements DeptBiz {
    @Resource
    private DeptDao deptDao;

    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    public void add(String deptName) {
        deptDao.add(deptName);
    }

    public void update(Dept dept) {
        deptDao.update(dept);
    }

    public void delete(int deptId) {
        deptDao.delete(deptId);
    }

}
