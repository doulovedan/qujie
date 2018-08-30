package com.jizhiwei.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jizhiwei.dao.EmployeeMapper;
import com.jizhiwei.entity.Employee;
import com.jizhiwei.service.IEmployeeService;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public Employee getEmployeeById(Integer eId) {
		Employee employee = employeeMapper.selectByPrimaryKey(eId);
		return employee;
	}

	@Override
	public void insertEmp(Employee employee) {
		employeeMapper.insert(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		PageHelper.startPage(0, 1);
		List<Employee> employees = employeeMapper.selectByExampleWithName(null);
		return employees;
	}

}
