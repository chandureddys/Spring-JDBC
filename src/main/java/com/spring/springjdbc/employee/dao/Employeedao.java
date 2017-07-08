package com.spring.springjdbc.employee.dao;

import java.util.List;

import com.spring.springjdbc.employee.dto.Employee;

public interface Employeedao {
	int create(Employee employee);
	
	int update(Employee employee);
	int delete(Employee employee);
	Employee read(int id);
}
