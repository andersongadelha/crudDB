package com.zup.crudDB.controller;

import com.zup.crudDB.dto.StudentRequest;
import com.zup.crudDB.dto.StudentResponse;
import com.zup.crudDB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<StudentResponse> getAll() {
        return studentService.findAll();
    }

    @PostMapping
    public StudentResponse insert(@RequestBody StudentRequest studentRequest){
        return studentService.insert(studentRequest);
    }

    @PutMapping("/{id}")
    public StudentResponse update(@PathVariable Long id, @RequestBody StudentRequest studentRequest) {
        return studentService.update(id, studentRequest);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
