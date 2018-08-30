package com.jizhiwei.service;

public interface IDepartmentService {
	void insertDepartment(String deptName);

	String selectDepartment(String deptId);

	int selectDeptIdByName(String deptName);
}
