package com.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Dept")
public class DepartmentBean
{
	
	int dept_id;
	String dept_name;
	Set<EmployeeBean> emp;
	
	@Id
	@GenericGenerator(name="inc", strategy="increment" )
	@GeneratedValue(generator="inc")
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	@JoinColumn(name="dept_name")
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="dept")
	public Set<EmployeeBean> getEmp() {
		return emp;
	}
	public void setEmp(Set<EmployeeBean> emp) {
		this.emp = emp;
	}
	
	

}
