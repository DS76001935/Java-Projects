package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Customer_Informations")
public class Customer_Informations_bean
{
	int cust_info;
	String fname,lname,mno;
	Customer_bean cid;
	
	public Customer_Informations_bean() {}
	
	@Id
	@GenericGenerator(name="inc", strategy="increment")
	@GeneratedValue(generator="inc")
	public int getCust_info() {
		return cust_info;
	}

	public void setCust_info(int cust_info) {
		this.cust_info = cust_info;
	}
	
	@JoinColumn(name="fname")
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@JoinColumn(name="lname")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@JoinColumn(name="mno")
	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="cust_info")
	public Customer_bean getCid() {
		return cid;
	}

	public void setCid(Customer_bean cid) {
		this.cid = cid;
	}
		
}
