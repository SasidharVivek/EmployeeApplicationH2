package com.springbootrestapi.dao;

import java.util.List;

import com.springbootrestapi.model.Employee;
import com.springbootrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an employee*/
	
	public Employee save(Employee emp) {

		return employeeRepository.save(emp);
	}
	
	
	/* search all employees*/
	
	public List<Employee> findAll(){

		return employeeRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Employee findOne(Long id) {
		return employeeRepository.findById(id).get();
	}
	
	
	/*delete an employee*/
	
	public void delete(Employee emp) {

		employeeRepository.delete(emp);
	}
	

}
