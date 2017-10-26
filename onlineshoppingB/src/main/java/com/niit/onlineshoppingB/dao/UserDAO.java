package com.niit.onlineshoppingB.dao;

import java.util.List;

import com.niit.onlineshoppingB.dto.Address;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.User;

public interface UserDAO {
	
	
	//add an user
		boolean addUser(User user);
		User getByEmail(String email);
		
		// add an address
			boolean addAddress(Address address);
			
			
		     Address getBillingAddress(User user);
			 List<Address> listShippingAddresses(User user);
			
		/*	alternative
			Address getBillingAddress(int userId);
			List<Address> listShippingAddresses(int userId);
		*/
			
			
			
			

}
