package com.bean;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Courses")
public class CourseBean
{
	
	int cid;
	String course_name;
	Collection<StudentBean> students;
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@JoinColumn(name="course_name")
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="courses")
	public Collection<StudentBean> getStudents() {
		return students;
	}
	public void setStudents(Collection<StudentBean> students) {
		this.students = students;
	}
	
}
