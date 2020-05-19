package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Emp")
public class EmployeeBean
{
	
	int emp_id;
	String emp_name;
	DepartmentBean dept;
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	@JoinColumn(name="emp_name")
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	public DepartmentBean getDept() {
		return dept;
	}
	public void setDept(DepartmentBean dept) {
		this.dept = dept;
	}
	
}
