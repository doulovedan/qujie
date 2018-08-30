package com.jizhiwei.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jizhiwei.common.Result;
import com.jizhiwei.service.IDepartmentService;

@RequestMapping("/department")
@Controller
public class DepartmentController {

	private Logger log = Logger.getLogger(DepartmentController.class);

	@Autowired
	IDepartmentService departmentServiceImp;

	@ResponseBody
	@RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
	public Result insertDepartment(@RequestParam("depatName") String depatName) {

		try {
			System.out.println(depatName);
			departmentServiceImp.insertDepartment(depatName);
			return Result.Success("部门保存成功");
		} catch (Exception e) {
			log.error(e.toString());
			return Result.Fail("部门保存失败");
		}

	}

	@ResponseBody
	@RequestMapping("/selectDepartment")
	public Result selectDepartment(@RequestParam("deptId") String deptId) {
		if (deptId != null) {
			String mContent = departmentServiceImp.selectDepartment(deptId);
			if ("".equals(mContent)) {
				return Result.Fail("查询失败");
			} else {
				Result result = new Result();
				result.setCode(1);
				result.setMsg("查询成功");
				result.setmContent(mContent);
				return result;
			}
		} else {
			return Result.Fail("Id不能为空");
		}
	}
}
