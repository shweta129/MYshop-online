package com.niit.onlineshoppingF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.onlineshoppingB.dao.UserDAO;
import com.niit.onlineshoppingB.dto.User;

@Controller
@RequestMapping("/register")
public class UserController {

	

	@Autowired
	UserDAO userDAO;
	
	

	
	@RequestMapping(value = "/user",method=RequestMethod.GET)
	 public ModelAndView showUser(@RequestParam(name="operation",required=false)String operation)
	{
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("userClickSignup", true);
		mv.addObject("title", "Registration");
		User user = new User();
		//Set the few fields
		//userdetail.setRole("User");
		
		
		if(operation!=null)
		{
			if(operation.equals("userdetail"))
			{
				mv.addObject("message", "All details are submitted successfully!You can login now!");
			}
		}
		
		return mv;
	}

	@RequestMapping(value = "/user", method=RequestMethod.POST)
	public String addUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email,@RequestParam("contactNumber") String contactNumber,
		    @RequestParam("password") String password,
			@RequestParam("address") String address,
			//@RequestParam("confirmPassword") String confirmPassword,
            User muser, Model model) {
		System.out.println("---Add User Starting-----");
		
		muser.setFirstName(firstName);
		muser.setLastName(lastName);
		muser.setEmail(email);
		muser.setContactNumber(contactNumber);
		muser.setPassword(password);
		muser.setAddress(address);
		//muser.setConfirmPassword(confirmPassword);
		
	
		
		
		
		userDAO.addUser(muser);
		//List<UserDetail> list = userdetailDAO.getUserDetailDetails();
		//m.addAttribute("UserDetail", list);

		System.out.println("---User Added----");
		return "redirect:/register/user?operation=user";
	}
}
