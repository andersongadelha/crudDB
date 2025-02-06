package com.zup.crudDB.service;

import com.zup.crudDB.dto.StudentResponse;
import com.zup.crudDB.model.Student;
import com.zup.crudDB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<StudentResponse> findAll() {
        List<Student> studentsEntity = studentRepository.findAll();

        return studentsEntity.stream()
                .map(student -> new StudentResponse(student.getId(), student.getName(), student.getAge()))
                .toList();
    }
}
