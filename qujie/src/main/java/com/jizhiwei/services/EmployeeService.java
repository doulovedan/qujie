package com.jizhiwei.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jizhiwei.common.Result;
import com.jizhiwei.dao.EmployeeMapper;
import com.jizhiwei.entity.Employee;

@Service
public class EmployeeService {

	Logger logger = Logger.getLogger(EmployeeService.class);

	@Autowired
	EmployeeMapper employeeMapper;

	public String getEmpById(String empId) {
		if (empId != null) {
			Employee employee = employeeMapper.selectByPrimaryKey(Integer.valueOf(empId));
			return employee.toString();
		} else {
			return null;
		}

	}

}
