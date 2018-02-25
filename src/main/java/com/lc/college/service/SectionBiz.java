package com.lc.college.service;

import com.lc.entity.Section;
import com.lc.entity.Staff;
import com.lc.entity.Timetable;
import com.lc.entity.custom.SectionCustom;

import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
public interface SectionBiz {
    public void delete(int sectionId);

    public void add(Section section);

    public List<SectionCustom> findAllCustom();

    public List<String> findAllCourseTitle();

    public List<Staff> findAllStaff();

    public void addTimetable(Timetable timetable);
}
