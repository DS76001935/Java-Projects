package com.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.CourseBean;
import com.bean.StudentBean;
import com.util.Mysql_Connection;

public class Student_Course_Dao
{
	public static void InsertStudent(StudentBean student)
	{
		Session session = Mysql_Connection.createConnection();
		
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(student);
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	public static void InsertCourse(CourseBean course)
	{
		Session session = Mysql_Connection.createConnection();
		
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(course);
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	public static Collection<StudentBean> getAllStudent()
	{
		Session session = Mysql_Connection.createConnection();
		Collection<StudentBean> list = new ArrayList<StudentBean>();
		list = session.createQuery("from StudentBean").list();
		return list;
	}
	public static StudentBean getStudentById(int sid)
	{
		StudentBean student = null;
		Session session = Mysql_Connection.createConnection();
		student = session.get(StudentBean.class, sid);
		return student;
	}
	public static void UpdateStudent(StudentBean student)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.update(student);
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	public static void DeleteStudent(StudentBean student)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(student);
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	public static void DeleteCourse(CourseBean course)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(course);
			tr.commit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}

}
