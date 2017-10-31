package com.niit.onlineshoppingF.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.niit.onlineshoppingB.dao.UserDAO;
import com.niit.onlineshoppingB.dto.User;
import com.niit.onlineshoppingF.model.UserModel;

@ControllerAdvice
public class GlobalController {
	
	/*
	 * 
	 * we create this globalcontroller and method that
	 *  will return the USerModel with the details that is required for display
	 */
	
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserDAO userDAO;
	
	
    private UserModel userModel = null;
	
	@ModelAttribute("userModel")
	public UserModel getUserModel() {
		//get the attribute from user model
				{
		if(session.getAttribute("userModel")==null) 
		{
			//add the user model
			
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			User user = userDAO.getByEmail(authentication.getName());
			if(user!=null) {
				
				//create a new UserModel object to pass the user details
				userModel = new UserModel();
				
				userModel.setId(user.getId());
				userModel.setEmail(user.getEmail());
				userModel.setRole(user.getRole());
				userModel.setFullName(user.getFirstName()+ " " +user.getLastName());
				
				if(userModel.getRole().equals("USER")){
					
					//Set the cart only if user is a buyer
					
					userModel.setCart(user.getCart());
					
				}
				//set the userModel in the session
				session.setAttribute("userModel",userModel);
				
				return userModel;
			}
		
			
			
		}
		
		//if it is null it mean we have to add user model
		//if it is not null it means it is already present into that session
		return (UserModel) session.getAttribute("userModel");
	}
	
	

	}
}
