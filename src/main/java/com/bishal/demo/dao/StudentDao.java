package com.bishal.demo.dao;

import com.bishal.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository("fakeDao")
public interface StudentDao {

    int insertNewStudent(UUID studentId, Student student);

    Student selectStudentById(UUID studentId);

    List<Student> selectAllStudents();

    int updateStudentById(UUID studentId, Student studentUpdate);

    int deleteStudentById(UUID studentId);
}
