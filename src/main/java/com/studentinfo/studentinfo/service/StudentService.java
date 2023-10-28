package com.studentinfo.studentinfo.service;

import com.studentinfo.studentinfo.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
