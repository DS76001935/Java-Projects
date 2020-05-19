package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Customer_Informations_bean;
import com.bean.Customer_bean;
import com.util.Customer_Mysql_Connection;

public class CustomerDao
{
	public static void insertCustomer(Customer_bean customer)
	{
		
		Session session = Customer_Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(customer);
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
	public static void insertCustomerInformations(Customer_Informations_bean cust_info)
	{
		
		Session session = Customer_Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.save(cust_info);
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
	public static List<Customer_bean> getAllCustomers()
	{
		List<Customer_bean> list = new ArrayList<Customer_bean>();
		Session session = Customer_Mysql_Connection.createConnection();
		list = session.createQuery("from Customer_bean").list();
		return list;
	}
	public static Customer_bean getCustomerById(int cid)
	{
		Customer_bean customer = null;
		Session session = Customer_Mysql_Connection.createConnection();
		customer = session.get(Customer_bean.class, cid);
		return customer;
	}
	public static void UpdateCustomer(Customer_bean customer)
	{
		Session session = Customer_Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.update(customer);
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
	public static void DeleteCustomer(Customer_bean customer)
	{
		Session session = Customer_Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(customer);
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
	public static void DeleteCustomerinformations(Customer_Informations_bean cust_info_bean)
	{
		Session session = Customer_Mysql_Connection.createConnection();
		try
		{
			Transaction tr = session.beginTransaction();
			session.delete(cust_info_bean);
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
