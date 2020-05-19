package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.CourseBean;
import com.bean.StudentBean;

public class Mysql_Connection
{
	
	public static Session createConnection()
	{
		Session session = null;
		SessionFactory sf = null;
		
		sf = new Configuration().addAnnotatedClass(StudentBean.class).addAnnotatedClass(CourseBean.class).configure().buildSessionFactory();
		
		session = sf.openSession();
		return session;
	}

}
