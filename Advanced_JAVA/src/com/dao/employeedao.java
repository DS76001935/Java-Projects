package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

import com.bean.employee_details;
import java.sql.PreparedStatement;
import com.util.mysql_connection;

public class employeedao {

	public static void insertion(employee_details e) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String sql = "insert into employee (fname,lname,age,email,salary,contact_no) values (?,?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, e.getFname());
		ps.setString(2,e.getLname());
		ps.setInt(3, e.getAge());
		ps.setString(4, e.getEmail());
		ps.setFloat(5, e.getSalary());
		ps.setString(6, e.getContact_no());
		
		ps.executeUpdate();
		System.out.println("Inserted Records Successfully !");
	}
	
	public static List<employee_details> getAllEmp()
	{
		Connection con = null;
		List<employee_details> list = new ArrayList<employee_details>();
		try
		{
			con=mysql_connection.getConnection();
			String sql = "select * from employee";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				employee_details e = new employee_details();
				
				e.setEid(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setAge(rs.getInt(4));
				e.setEmail(rs.getString(5));
				e.setSalary(rs.getFloat(6));
				e.setContact_no(rs.getString(7));
				list.add(e);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static employee_details getAllEmpById(int eid)
	{
		employee_details e = null;
		Connection con= null;
		try
		{
			con=mysql_connection.getConnection();
			
			String sql = "select * from employee where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, eid);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				e=new employee_details();
				e.setEid(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setLname(rs.getString(3));
				e.setAge(rs.getInt(4));
				e.setEmail(rs.getString(5));
				e.setSalary(rs.getFloat(6));
				e.setContact_no(rs.getString(7));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return e;
	}
	public static void updation(employee_details e) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String sql = "update employee set fname=?,lname=?,age=?,email=?,salary=?,contact_no=? where eid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, e.getFname());
		ps.setString(2, e.getLname());
		ps.setInt(3, e.getAge());
		ps.setString(4, e.getEmail());
		ps.setFloat(5, e.getSalary());
		ps.setString(6, e.getContact_no());
		ps.setInt(7, e.getEid());
		ps.executeUpdate();
		System.out.println("Updated Records Successfully !");
	}
	public static void deletion(employee_details e) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String sql = "delete from employee where eid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, e.getEid());
		ps.executeUpdate();
		System.out.println("Deleted Records Successfully !");
	}
}