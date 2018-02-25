package com.lc.college.dao;

import com.lc.entity.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lc on 16-2-11.
 */
public interface ClazzDao {
    public void add(Clazz clazz);

    public void delete(int clazzId);

    public List<Class> findAll();

    public int getClassCount(@Param("specName") String specName, @Param("year") String year);
}
