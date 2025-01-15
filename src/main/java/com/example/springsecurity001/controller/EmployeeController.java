package com.example.springsecurity001.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    @GetMapping
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String getAllEmployees() {
        return "You Received all the employee details";
    }

    @PutMapping
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public String updateEmployee() {
        return "You Received the updated employee details";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping
    public String deleteEmployee() {
        return "Employee details deleted";
    }

}
