package com.techlabs.data_analyzer_app;

public class EmpData {

	private String empName, empDesignation, dateOfJoin, commission;
	private int empId, managerId, salary, deptNnumber;

	public EmpData(String empName, String empDesignation, String dateOfJoin,
			String commission, int empId, int managerId, int salary,
			int deptNnumber) {
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.dateOfJoin = dateOfJoin;
		this.commission = commission;
		this.empId = empId;
		this.managerId = managerId;
		this.salary = salary;
		this.deptNnumber = deptNnumber;
	}
	

	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public String getDateOfJoin() {
		return dateOfJoin;
	}


	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}


	public String getCommission() {
		return commission;
	}


	public void setCommission(String commission) {
		this.commission = commission;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getDeptNnumber() {
		return deptNnumber;
	}


	public void setDeptNnumber(int deptNnumber) {
		this.deptNnumber = deptNnumber;
	}
	
	@Override
	public String toString() {
		return "empName=" +empName+"empDesignation="+empDesignation+"dateOfJoin="+dateOfJoin+"commission="+commission+"empId="+empId+"managerId="+managerId+"salary="+salary+"deptNnumber="+deptNnumber;
	}

}
