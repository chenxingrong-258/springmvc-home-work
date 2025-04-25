package com.xzit.controller;

import com.xzit.model.Teacher;
import com.xzit.service.TeacherService;
import com.xzit.service.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("select")
    public String select(HttpServletRequest request) {
        List<Teacher> list = teacherService.selectAll();
        request.setAttribute("list", list);
        return "list.jsp";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        teacherService.deleteById(id);
        return "redirect:/select";
    }
    @PostMapping("save")
    public String save(Teacher teacher) {
        teacherService.insert(teacher);
        return "redirect:/select";
    }
    @RequestMapping("update")
    public String update(Teacher teacher) {
        teacherService.update(teacher);
        return "redirect:/select";
    }

}
