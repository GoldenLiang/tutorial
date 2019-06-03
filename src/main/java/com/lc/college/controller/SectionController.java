package com.lc.college.controller;

import com.lc.college.service.SectionBiz;
import com.lc.entity.Section;
import com.lc.entity.Timetable;
import com.lc.util.TermContainer;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Timeable;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lc on 16-2-12.
 */
@Controller
@RequestMapping("section.do")
public class SectionController {
    @Resource(name = "sectionBizImpl")
    private SectionBiz sectionBiz;

    @RequiresRoles("admin")
    @RequestMapping("section.view")
    public String sectionView(Model m) {
        m.addAttribute("sectionList", sectionBiz.findAllCustom());
        return "/admin/college/section";
    }

    @RequiresRoles("admin")
    @RequestMapping("section_add.view")
    public String sectionAddView(Model m) {
        m.addAttribute("courseTitleList", sectionBiz.findAllCourseTitle());
        m.addAttribute("staffList", sectionBiz.findAllStaff());
        m.addAttribute("termList", TermContainer.getTermList());
        return "/admin/college/section_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("section_timetable_add.view")
    public String sectionTimetableAdd(Model m) {
        return "/admin/college/section_timetable_add";
    }

    @RequiresRoles("admin")
    @RequestMapping("add")
    public String add(Section section, HttpSession session) {
        sectionBiz.add(section);
        return "redirect:section.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("addTimetable")
    public String addTimetable(Timetable timetable) {
        sectionBiz.addTimetable(timetable);
        return "redirect:section.view";
    }

    @RequiresRoles("admin")
    @RequestMapping("delete")
    public String delete(int secId) {
        sectionBiz.delete(secId);
        return "redirect:section.view";
    }
}