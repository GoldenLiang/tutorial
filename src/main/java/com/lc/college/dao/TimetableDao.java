package com.lc.college.dao;

import com.lc.entity.Timetable;

/**
 * Created by lc on 16-2-13.
 */
public interface TimetableDao {
    public void add(Timetable timetable);

    public void delete(int secId);
}
