package org.me.learning.docker.controller;


import org.me.learning.docker.model.Student;
import org.me.learning.docker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // here just to note we add nothing
@RequestMapping("/api/v1") // here we add the url we want
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/greeting") // here we can use GetMapping but it is not the best way because
    // it is not get request so if we just want to print something we use RequestMapping
    public String index() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAllStudents();

    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

}
