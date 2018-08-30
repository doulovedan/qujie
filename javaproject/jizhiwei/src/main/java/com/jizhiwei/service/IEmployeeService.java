package com.jizhiwei.service;

import java.util.List;

import com.jizhiwei.entity.Employee;

public interface IEmployeeService {

	Employee getEmployeeById(Integer eId);

	void insertEmp(Employee employee);

	List<Employee> getAllEmployee();
}
