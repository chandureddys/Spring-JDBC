package com.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.Employeedao;
import com.spring.springjdbc.employee.dto.Employee;

public class EmployeedaoImpl implements Employeedao {

	
	 private JdbcTemplate jdbcTemplate;
	 
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub

		String sql = "insert into employee values (?,?,?)";
		
		int result = jdbcTemplate.update(sql, employee.getId(),employee.getFirstName(),employee.getLastName());
		
		return result;
	}

}
