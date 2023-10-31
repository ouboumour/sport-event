package com.sqli.sportevent.controller;

import com.sqli.sportevent.model.Student;
import com.sqli.sportevent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
