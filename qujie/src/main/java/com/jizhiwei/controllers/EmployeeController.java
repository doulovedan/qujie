package com.jizhiwei.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jizhiwei.common.Result;
import com.jizhiwei.services.EmployeeService;

@RequestMapping("/emp")
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@ResponseBody
	@RequestMapping("/getEmpInfo")
	public Result getUserById(@RequestParam(value = "empId", required = true) String empId) {
		String emp = empService.getEmpById(empId);
		if (emp == null) {
			return Result.fail("员工不存在");
		} else {
			return Result.success(emp);
		}
	}
}
