package com.spring.springjdbc.employee.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springjdbc.employee.dao.Employeedao;
import com.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/employee/test/config.xml");
		
		Employeedao dap = (Employeedao) context.getBean("employeedaoImpl");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("sekhar");
		employee.setLastName("Reddy");
		
	int result = dap.create(employee);
	System.out.println(result);
		
		
	}

}
