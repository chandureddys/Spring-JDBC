package com.spring.springjdbc.employee.dao.impl;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.Employeedao;
import com.spring.springjdbc.employee.dao.RowmapperImpl;
import com.spring.springjdbc.employee.dto.Employee;

public class EmployeedaoImpl implements Employeedao {

	
	 private JdbcTemplate jdbcTemplate;
	 
	
	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub

		String sql = "insert into employee values (?,?,?)";
		
		int result = jdbcTemplate.update(sql, employee.getId(),employee.getFirstName(),employee.getLastName());
		
		return result;
	}
	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set firstName=?,lastName=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(),employee.getLastName(),employee.getId());
		return result;
	}
	
	@Override
	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "delete from  employee where id=?";
		int result = jdbcTemplate.update(sql, employee.getId());
		return result;
	}
	
	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		String sql = "select *  from  employee where id=?";
		RowmapperImpl employeerwo = new RowmapperImpl();
		Employee employee = jdbcTemplate.queryForObject(sql, employeerwo,id);
		return  employee;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
}
