package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;

public class Mysql_Connection
{
	public static Session createConnection()
	{
		Session session = null;
		SessionFactory sf = null;
		
		sf = new Configuration().addAnnotatedClass(DepartmentBean.class).addAnnotatedClass(EmployeeBean.class).configure().buildSessionFactory();
		session = sf.openSession();
		return session;
	}
}
