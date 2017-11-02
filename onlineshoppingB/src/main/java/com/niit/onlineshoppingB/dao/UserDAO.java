package com.niit.onlineshoppingB.dao;

import java.util.List;


import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.User;

public interface UserDAO {
	
	
	//add an user
		void addUser(User user);
		User getByEmail(String email);
		User validateEmail(String email);
	    User validatecontactNumber(String contactNumber);
		
		// add an address
			
			
		/*	alternative
			Address getBillingAddress(int userId);
			List<Address> listShippingAddresses(int userId);
		*/
			
			
			
			

}
