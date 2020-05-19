package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.customer_details;
import com.util.mysql_connection;

public class customerDao {

	public static void insert_customer(customer_details cust) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String sql = "insert into customer (fname,lname,mno,email,password) values (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, cust.getFname());
		ps.setString(2, cust.getLname());
		ps.setString(3, cust.getMno());
		ps.setString(4, cust.getEmail());
		ps.setString(5, cust.getPassword());
		ps.executeUpdate();
		
		System.out.println("This Customer Details Are Inserted Successfully !");
	}
	
	public static List<customer_details> getAllCustomer()
	{
		Connection con = null;
		List<customer_details> list = new ArrayList<customer_details>();
		
		try
		{
			con = mysql_connection.getConnection();
			String qur = "select * from customer";
			PreparedStatement ps = con.prepareStatement(qur);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				customer_details cust = new customer_details();
				
				cust.setId(rs.getInt(1));
				cust.setFname(rs.getString(2));
				cust.setLname(rs.getString(3));
				cust.setMno(rs.getString(4));
				cust.setEmail(rs.getString(5));
				cust.setPassword(rs.getString(6));
				list.add(cust);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return list;
	}
	
	public static customer_details getAllCustmerById(int custid)
	{
		customer_details cust = null;
		Connection con = null;
		try
		{
			con = mysql_connection.getConnection();
			String qur = "select * from customer where id = ?";
			PreparedStatement ps = con.prepareStatement(qur);
			ps.setInt(1, custid);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				cust = new customer_details();
				cust.setId(rs.getInt(1));
				cust.setFname(rs.getString(2));
				cust.setLname(rs.getString(3));
				cust.setMno(rs.getString(4));
				cust.setEmail(rs.getString(5));
				cust.setPassword(rs.getString(6));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return cust;
	}
	public static void updation(customer_details cust) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String qur = "update customer set fname = ?, lname = ?, mno = ?, email = ?, password = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(qur);
		ps.setString(1, cust.getFname());
		ps.setString(2, cust.getLname());
		ps.setString(3, cust.getMno());
		ps.setString(4, cust.getEmail());
		ps.setString(5, cust.getPassword());
		ps.setInt(6, cust.getId());
		ps.executeUpdate();
		System.out.println("This Customer's All data Is To Be Updated !");
	}
	public static void deletion(customer_details cust) throws Exception
	{
		Connection con = mysql_connection.getConnection();
		
		String qur = "delete from customer where id = ?";
		PreparedStatement ps = con.prepareStatement(qur);
		ps.setInt(1, cust.getId());
		ps.executeUpdate();
		System.out.println("This Customer's All data Is To Be Deleted !");
	}
	public static customer_details checkLogin(customer_details cust) throws Exception
	{
		customer_details customer = null;
		try
		{
			Connection con = mysql_connection.getConnection();
			String qur = "select * from customer where email = ? and password = ?";
			PreparedStatement ps = con.prepareStatement(qur);
			ps.setString(1, cust.getEmail());
			ps.setString(2, cust.getPassword());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				customer = new customer_details();
				customer.setId(rs.getInt(1));
				customer.setFname(rs.getString(2));
				customer.setLname(rs.getString(3));
				customer.setMno(rs.getString(4));
				customer.setEmail(rs.getString(5));
				customer.setPassword(rs.getString(6));
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return customer;
		
	}

}
