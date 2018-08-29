package com.jizhiwei.entity;

import java.math.BigDecimal;

public class Employee {
	private Integer eId;

	private String eName;

	private String eEmail;

	private String ePhone;

	private String eSex;

	private Integer eLocationId;

	private Integer eDeptId;

	private BigDecimal salary;

	private Department department;
	private Address address;

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eEmail=" + eEmail + ", ePhone=" + ePhone + ", eSex="
				+ eSex + ", eLocationId=" + eLocationId + ", eDeptId=" + eDeptId + ", salary=" + salary
				+ ", department=" + department + ", address=" + address + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName == null ? null : eName.trim();
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail == null ? null : eEmail.trim();
	}

	public String getePhone() {
		return ePhone;
	}

	public void setePhone(String ePhone) {
		this.ePhone = ePhone == null ? null : ePhone.trim();
	}

	public String geteSex() {
		return eSex;
	}

	public void seteSex(String eSex) {
		this.eSex = eSex == null ? null : eSex.trim();
	}

	public Integer geteLocationId() {
		return eLocationId;
	}

	public void seteLocationId(Integer eLocationId) {
		this.eLocationId = eLocationId;
	}

	public Integer geteDeptId() {
		return eDeptId;
	}

	public void seteDeptId(Integer eDeptId) {
		this.eDeptId = eDeptId;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
}