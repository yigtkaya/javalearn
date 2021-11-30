package com.example.h2demo.controller;

import com.example.h2demo.model.Student;
import com.example.h2demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    //autowired the StudentService class
    @Autowired
    StudentService studentService;
    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/students")
    private List<Student> getAllStudent()
    {
        return studentService.getAllStudents();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/student/{id}")
    private Optional<Student> getStudent(@PathVariable("id") Long id)
    {
        return studentService.getStudentById(id);
    }
    //creating a delete mapping that deletes a specific student
    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") Long id)
    {
        studentService.delete(id);
    }
    //creating post mapping that post the student detail in the database
    @PutMapping("/student")
    private Long saveStudent(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}