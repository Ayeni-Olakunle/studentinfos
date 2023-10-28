package com.studentinfo.studentinfo.service;

import com.studentinfo.studentinfo.model.Student;
import com.studentinfo.studentinfo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
}
