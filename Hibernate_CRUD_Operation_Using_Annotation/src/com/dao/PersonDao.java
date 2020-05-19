package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.PersonBean;
import com.util.Mysql_Connection;

public class PersonDao
{
	
	public static void InsertPerson(PersonBean person)
	{
		Session session = Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.save(person);
		tr.commit();
		session.close();
	}
	public static List<PersonBean> getAllPersons()
	{
		List<PersonBean> list = new ArrayList<PersonBean>();
		Session session = Mysql_Connection.createConnection();
		list = session.createQuery("from PersonBean").list();
		return list;
	}
	public static PersonBean getPersonById(int pid)
	{
		PersonBean person = null;
		Session session = Mysql_Connection.createConnection();
		person = session.get(PersonBean.class, pid);
		return person;
	}
	public static void UpdatePerson(PersonBean person)
	{
		Session session = Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.update(person);
		tr.commit();
		session.close();
	}
	public static void DeletePerson(PersonBean person)
	{
		Session session = Mysql_Connection.createConnection();
		Transaction tr = session.beginTransaction();
		session.delete(person);
		tr.commit();
		session.close();
	}

}
