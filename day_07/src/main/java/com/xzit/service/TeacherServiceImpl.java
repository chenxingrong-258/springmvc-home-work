package com.xzit.service;

import com.xzit.mapper.TeacherMapper;
import com.xzit.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void insert(Teacher teacher) {
        teacherMapper.save(teacher);

    }

    @Override
    public void deleteById(int id) {
        teacherMapper.delete(id);

    }

    @Override
    public void update(Teacher teacher) {
        teacherMapper.update(teacher);
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectList();
    }
}
