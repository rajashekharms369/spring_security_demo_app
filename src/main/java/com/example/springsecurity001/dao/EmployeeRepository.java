package com.example.springsecurity001.dao;

import com.example.springsecurity001.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByUsername(String employeeName);

}
