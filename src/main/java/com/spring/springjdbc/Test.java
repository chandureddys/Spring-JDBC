package com.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");
		
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		
		String sql = "insert into employee values (?,?,?)";
		
	int result=jdbcTemplate.update(sql,new Integer(1),"Chandrasekhar","Reddy");
	
	int result2 = jdbcTemplate.getMaxRows();
	
	System.out.println(result);
	System.out.println(result2);
		
		
	}

}
