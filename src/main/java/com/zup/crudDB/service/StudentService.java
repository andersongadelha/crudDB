package com.zup.crudDB.service;

import com.zup.crudDB.dto.StudentRequest;
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

    public StudentResponse insert(StudentRequest request) {
        Student studentToBeSave = new Student(request.getName(), request.getAge());
        Student savedStudant = studentRepository.save(studentToBeSave);

        return new StudentResponse(savedStudant.getId(), savedStudant.getName(), savedStudant.getAge());
    }
}