package com.niit.onlineshoppingB.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Supplier {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int suppid;
    
    String suppname,address;

	public int getSuppid() 
	{
		return suppid;
	}

	public void setSuppid(int suppid) 
	{
		this.suppid = suppid;
	}

	public String getSuppname() 
	{
		return suppname;
	}

	public void setSuppname(String suppname) 
	{
		this.suppname = suppname;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

}
