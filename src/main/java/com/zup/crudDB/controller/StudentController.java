package com.zup.crudDB.controller;

import com.zup.crudDB.dto.StudentResponse;
import com.zup.crudDB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(StudentController.BASE_PATH)
public class StudentController {
    public static final String BASE_PATH = "/alunos";

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentResponse> buscarTodos() {
        return studentService.findAll();
    }
}
