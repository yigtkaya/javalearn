package com.example.h2demo.service;

import com.example.h2demo.model.Student;
import com.example.h2demo.repositry.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
            List<Student> students = new ArrayList<Student>();
            studentRepository.findAll().forEach(student -> students.add(student));
            return students;
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(Student student){
        studentRepository.save(student);
    }
    public void delete(Long id){
        studentRepository.deleteById(id);
    }

}
