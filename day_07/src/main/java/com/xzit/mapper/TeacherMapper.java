package com.xzit.mapper;

import com.xzit.model.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {
    @Insert("insert into teacher values (default,#{name},#{addr},#{age},#{job},#{sal})")
    void save(Teacher teacher);
    @Delete("delete from teacher where id=#{id}")
    void delete(int id);
    @Select("select * from teacher")
    List<Teacher> selectList();
    @Update("update teacher set name=#{name},addr=#{addr},age=#{age},job=#{job},sal=#{sal} where id=#{id}")
    void update(Teacher teacher);
}
