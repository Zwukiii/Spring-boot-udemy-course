package com.example.demo.rest;


import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudent;

    @PostConstruct
    public void loadData() {
        theStudent = new ArrayList<>();
        theStudent.add(new Student("Egon", "patel"));
        theStudent.add(new Student("Mario", "patel"));
        theStudent.add(new Student("Mary", "patel"));

    }


    @GetMapping("/students")
    public List<Student> getMapping() {
        return theStudent;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId >= theStudent.size() || (studentId < 0)) {
            throw new StudentNotFoundException("student id not found - " + studentId);
        }

        return theStudent.get(studentId);
    }



}
