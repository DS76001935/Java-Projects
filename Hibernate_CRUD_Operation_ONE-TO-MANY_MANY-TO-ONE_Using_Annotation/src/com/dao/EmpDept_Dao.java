package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;
import com.util.Mysql_Connection;

public class EmpDept_Dao
{
	
	public static void InsertDept(DepartmentBean dept)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(dept);
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
	public static void InsertEmp(EmployeeBean emp)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(emp);
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
	public static List<DepartmentBean> getAllDept()
	{
		Session session = Mysql_Connection.createConnection();
		List<DepartmentBean> list = session.createQuery("from DepartmentBean").list();
		return list;
	}
	public static List<EmployeeBean> getAllEmp()
	{
		Session session = Mysql_Connection.createConnection();
		List<EmployeeBean> list = session.createQuery("from EmployeeBean").list();
		return list;
	}
	public static EmployeeBean getEmpById(int emp_id)
	{
		Session session = Mysql_Connection.createConnection();
		EmployeeBean emp = null;
		emp = session.get(EmployeeBean.class, emp_id);
		return emp;
	}
	public static void updateEmp(EmployeeBean emp)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.update(emp);
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
	public static void deleteEmp(EmployeeBean emp)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(emp);
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
	public static void deleteDept(DepartmentBean dept)
	{
		Session session = Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(dept);
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
