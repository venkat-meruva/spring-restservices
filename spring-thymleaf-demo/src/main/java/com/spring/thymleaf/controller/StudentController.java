package com.spring.thymleaf.controller;

import com.spring.thymleaf.model.Student;
import com.spring.thymleaf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }



    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added";
    }

    @PutMapping("/students/{id}")
    public String updateStudent(@RequestBody  Student student, @PathVariable String id){
        studentService.updateStudent(student,id);
        return "updated";
    }

    @DeleteMapping ("/students/{id}")
    public String deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
        return "deleted";
    }

}
