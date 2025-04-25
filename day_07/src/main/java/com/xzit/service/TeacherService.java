package com.xzit.service;

import com.xzit.model.Teacher;

import java.util.List;

public interface TeacherService {
    void insert(Teacher teacher);
    void deleteById(int id);
    void update(Teacher teacher);
    List<Teacher> selectAll();
}
