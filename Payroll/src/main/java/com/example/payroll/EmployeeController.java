package com.example.payroll;

import org.springframework.boot.WebApplicationType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
// get All employeess
    @GetMapping("/employees")
    List<Employee> all(){
        return employeeRepository.findAll();
    }
    // get one employee
    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id){
        return employeeRepository.findById(id).orElseThrow((null));
    }

    // put mapping
    @PutMapping(value = "/employees/{id}" , consumes = MediaType.APPLICATION_JSON_VALUE)
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
            return employeeRepository.findById(id)
                    .map(employee -> {
                        employee.setName(newEmployee.getName());
                        employee.setName(newEmployee.getRole());
                        return employeeRepository.save(employee);
                    }).orElseGet(() -> {
                        newEmployee.setId(id);
                        return employeeRepository.save(newEmployee);
                    });
    }


    //delete
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }
}

