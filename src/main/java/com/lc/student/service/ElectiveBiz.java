package com.lc.student.service;

import com.lc.entity.Section;
import com.lc.entity.custom.SectionCustom;

import java.util.List;

/**
 * Created by lc on 16-2-16.
 */
public interface ElectiveBiz {
    public void add(int secId, String stdId);

    public List<SectionCustom> findAllSection();

    public void delete(int secId, String stdId);
}
