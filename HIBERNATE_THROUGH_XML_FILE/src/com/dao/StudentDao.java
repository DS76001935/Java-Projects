package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student_Informations;
import com.util.StudentUtil;

public class StudentDao
{
	
	public static void insertStudent(Student_Informations student)
	{
		Session session = StudentUtil.createConnection();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}
	
	public static List<Student_Informations> getAllStudents()
	{
		List<Student_Informations> list = null;
		Session session = StudentUtil.createConnection();
		list = session.createQuery("from Student_Informations").list();
		return list;
	}
	
}
