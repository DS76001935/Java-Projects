package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.All_Subjects_Details;
import com.util.mysql_connection;

public class Subject_Dao
{

	public static void insert_Subjects(All_Subjects_Details subject) throws Exception
	{
		
		Connection con = mysql_connection.getConnection();
		
		String sql = "insert into subjects (subject_code,subject_name,subject_credit,faculty_name) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, subject.getSubject_code());
		ps.setString(2, subject.getSubject_name());
		ps.setInt(3, subject.getSubject_credit());
		ps.setString(4, subject.getFaculty_name());
		
		ps.executeUpdate();
		
		System.out.println("This Subject Is Inserted Successfully !");
		
	}
	
	public static List<All_Subjects_Details> getAllSubjects()
	{
		Connection con = null;
		List<All_Subjects_Details> list = new ArrayList<All_Subjects_Details>();
		try
		{
			con = mysql_connection.getConnection();
			String sql = "select * from subjects";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				All_Subjects_Details subject = new All_Subjects_Details();
				subject.setSubject_code(rs.getString(1));
				subject.setSubject_name(rs.getString(2));
				subject.setSubject_credit(rs.getInt(3));
				subject.setFaculty_name(rs.getString(4));
				list.add(subject);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return list;
	}
	
}
