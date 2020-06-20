package com.positive.springdatarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.positive.springdatarest.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
