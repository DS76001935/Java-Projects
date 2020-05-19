package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student_Informations;
import com.util.Student_Mysql_Connection;

public class StudentDao
{

	public static void insertStudent(Student_Informations student)
	{
		
		Session session = Student_Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
		
	}
	
	public static List<Student_Informations> getAllStudents()
	{
		List<Student_Informations> list = null;
		Session session = Student_Mysql_Connection.createConnection();
		list = session.createQuery("from Student_Informations").list();
		return list;
	}
	public static Student_Informations getStudentsById(int sid)
	{
		Student_Informations student = null;
		Session session = Student_Mysql_Connection.createConnection();
		student = session.get(Student_Informations.class, sid);
		return student;
	}

	public static void updateStudent(Student_Informations student)
	{
		Session session = Student_Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.update(student);
		tr.commit();
		session.close();
	}
	
	public static void deleteStudent(Student_Informations student)
	{
		Session session = Student_Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.delete(student);
		tr.commit();
		session.close();
	}

}
