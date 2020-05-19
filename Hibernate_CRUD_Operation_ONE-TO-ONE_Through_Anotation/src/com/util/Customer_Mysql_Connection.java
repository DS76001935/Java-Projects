package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Customer_Informations_bean;
import com.bean.Customer_bean;

public class Customer_Mysql_Connection
{
	
	public static Session createConnection()
	{
		Session session = null;
		SessionFactory sf = null;
		
		sf = new Configuration()
				.addAnnotatedClass(Customer_Informations_bean.class)
				.addAnnotatedClass(Customer_bean.class)
				.configure()
				.buildSessionFactory();
		
		session = sf.openSession();
		
		return session;
	}
	
}
