package com.dastansultanov.spring.springboot.spring_data_jpa.dao;


import com.dastansultanov.spring.springboot.spring_data_jpa.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByName(String name);
}