package com.lc.college.service.impl;

import com.lc.college.dao.CourseDao;
import com.lc.college.dao.SectionDao;
import com.lc.college.dao.StaffDao;
import com.lc.college.dao.TimetableDao;
import com.lc.college.service.SectionBiz;
import com.lc.entity.Section;
import com.lc.entity.Staff;
import com.lc.entity.Timetable;
import com.lc.entity.custom.SectionCustom;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lc on 16-2-12.
 */
@Service
public class SectionBizImpl implements SectionBiz {

    @Resource
    private SectionDao sectionDao;
    @Resource
    private CourseDao courseDao;
    @Resource
    private StaffDao staffDao;

    @Resource
    private TimetableDao timetableDao;

    @Transactional
    @Override
    public void delete(int secId) {
        sectionDao.delete(secId);
        timetableDao.delete(secId);
    }

    @Override
    public void add(Section section) {
        sectionDao.add(section);

    }

    @Override
    public List<SectionCustom> findAllCustom() {
        return sectionDao.findAllCustom();
    }

    @Override
    public List<String> findAllCourseTitle() {
        return courseDao.findAllCourseTitle();
    }


    @Override
    public List<Staff> findAllStaff() {
        return staffDao.findAll();
    }

    @Override
    public void addTimetable(Timetable timetable) {
        timetableDao.add(timetable);
    }


}
