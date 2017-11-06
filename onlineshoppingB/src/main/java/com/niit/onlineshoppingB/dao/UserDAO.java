package com.niit.onlineshoppingB.dao;

import java.util.List;


import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.UserDetail;

public interface UserDAO {
	
	
	//add an user
		void addUser(UserDetail user);
		UserDetail getByEmail(String email);
		UserDetail validateEmail(String email);
	    UserDetail validatecontactNumber(String contactNumber);
		
		// add an address
			
			
		/*	alternative
			Address getBillingAddress(int userId);
			List<Address> listShippingAddresses(int userId);
		*/
			
			
			
			

}
