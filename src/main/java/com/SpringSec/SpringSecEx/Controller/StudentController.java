package com.SpringSec.SpringSecEx.Controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {
    
    private List<Student> student  = new ArrayList<>(
       List.of(
        new Student(1, "vatsal", 60), 
        new Student(2, "vijit", 65)
       )

    );

    @GetMapping("/student")
    public List<Student> getStudents() {
        return student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public boolean postMethodName(@RequestBody Student stud) {
        student.add(stud);
        return true;
    }
    
    
}
