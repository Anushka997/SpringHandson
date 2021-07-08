package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Employee;

public class EmployeeDao {

	public static ArrayList<Employee> emplist;
	
	@SuppressWarnings("unchecked")
	public EmployeeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		emplist = context.getBean("empList", ArrayList.class);
		((AbstractApplicationContext) context).close();
	}
	
	public ArrayList<Employee> getAllEmployees() {
		return emplist;
	}
	
}
