package com.jizhiwei.controller;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jizhiwei.common.Result;
import com.jizhiwei.dao.AddressMapper;
import com.jizhiwei.dao.DepartmentMapper;
import com.jizhiwei.dao.EmployeeMapper;
import com.jizhiwei.entity.Employee;
import com.jizhiwei.service.IAddressService;
import com.jizhiwei.service.IDepartmentService;
import com.jizhiwei.service.IEmployeeService;
import com.jizhiwei.serviceimp.AddressService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private Logger log = Logger.getLogger(EmployeeController.class);

	@Autowired
	IEmployeeService empService;

	@Autowired
	IDepartmentService deptService;

	@Autowired
	IAddressService addService;

	@ResponseBody
	@RequestMapping(value = "/getEmpById", method = RequestMethod.POST)
	public Result getEmployeeById(@RequestParam("empId") String empId) {
		if (empId != null) {
			try {
				Employee employee = empService.getEmployeeById(Integer.valueOf(empId));
				return Result.Success(employee.toString());
			} catch (Exception e) {
				log.error(e.toString());
				return Result.Fail("查询失败");
			}
		} else {
			return Result.Fail("empId不能为空");
		}
	}

	@ResponseBody
	@RequestMapping("/insertEmployee")
	public Result insertEmployee(@RequestParam("empName") String empName, @RequestParam("empEmail") String empEmail,
			@RequestParam("empPhone") String empPhone, @RequestParam("empSex") String empSex,
			@RequestParam("salary") String salary, @RequestParam("deptName") String deptName,
			@RequestParam("empCity") String empCity) {
		int deptId = deptService.selectDeptIdByName(deptName);
		if (deptId == -1) {
			return Result.Fail("部门名不存在");
		}
		int addressId = addService.getAddressIdByCityName(empCity);
		if (addressId == -1) {
			return Result.Fail("城市名不存在");
		}
		try {
			Employee employee = new Employee();
			employee.seteName(empName);
			employee.seteSex(empSex);
			employee.setePhone(empPhone);
			employee.seteDeptId(deptId);
			employee.seteLocationId(addressId);
			employee.seteEmail(empEmail);
			employee.setSalary(BigDecimal.valueOf(Double.valueOf(salary)));
			empService.insertEmp(employee);
			return Result.Success("保存成功");
		} catch (Exception e) {
			log.error(e.toString());
			return Result.Fail(e.toString());
		}

	}

	@ResponseBody
	@RequestMapping("/getAllEmp")
	public Result getAllEmployee() {
		List<Employee> employees = empService.getAllEmployee();
		return Result.Success(employees.toString());
	}
}
