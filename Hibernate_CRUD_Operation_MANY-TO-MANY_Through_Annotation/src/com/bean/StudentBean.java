package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Students")
public class StudentBean
{
	
	int sid;
	String fname,lname;
	Collection<CourseBean> courses;
	
	@Id
	@GenericGenerator(name="inc", strategy="increment")
	@GeneratedValue(generator="inc")
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@JoinColumn(name="fname")
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@JoinColumn(name="lname")
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@ManyToMany
	@JoinTable(name="Students_Courses", joinColumns = @JoinColumn(name="std_id"), inverseJoinColumns = @JoinColumn(name="cid"))
	public Collection<CourseBean> getCourses() {
		return courses;
	}
	public void setCourses(Collection<CourseBean> courses) {
		this.courses = courses;
	}

}
