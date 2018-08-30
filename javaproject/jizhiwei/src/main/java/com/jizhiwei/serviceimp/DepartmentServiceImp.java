package com.jizhiwei.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jizhiwei.dao.DepartmentMapper;
import com.jizhiwei.entity.Department;
import com.jizhiwei.entity.DepartmentExample;
import com.jizhiwei.entity.DepartmentExample.Criteria;
import com.jizhiwei.service.IDepartmentService;

@Service
public class DepartmentServiceImp implements IDepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public void insertDepartment(String deptName) {
		Department department = new Department();
		department.setdName(deptName);
		departmentMapper.insert(department);
	}

	@Override
	public String selectDepartment(String deptId) {
		try {
			Integer did = Integer.valueOf(deptId);
			Department department = departmentMapper.selectByPrimaryKey(did);
			return department.toString();
		} catch (Exception e) {
			return "";
		}
	}

	@Override
	public int selectDeptIdByName(String deptName) {
		DepartmentExample example = new DepartmentExample();
		Criteria criteria = example.createCriteria();
		criteria.andDNameEqualTo(deptName);
		List<Department> depts = departmentMapper.selectByExample(example);
		if (depts != null && depts.size() > 0) {
			return depts.get(0).getdId();
		}
		return -1;
	}

}
