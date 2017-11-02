package com.niit.onlineshoppingF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.onlineshoppingB.daoImpl.CartItemDAOImpl;
import com.niit.onlineshoppingB.daoImpl.UserOrderDAOImpl;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.User;
import com.niit.onlineshoppingB.dto.UserOrder;

public class UserOrderController {

	@Autowired
	 UserOrderDAOImpl userorderDAOImpl;
	 @Autowired
	 CartItemDAOImpl cartitemDAOImpl;

	 @RequestMapping("/cart/{cartid}/order")
		public ModelAndView createOrder(@PathVariable int cartid,Model model)
		{
			   ModelAndView mv=new ModelAndView("page");
			   mv.addObject("userClickOrder", true);
			   mv.addObject("title", "Order");
				Cart cart=cartitemDAOImpl.getCart(cartid);
				User user=cart.getUser();
			    cart.setUser(user);
			UserOrder userorder=userorderDAOImpl.createOrder(cart);
			model.addAttribute("cart",cart);
			model.addAttribute("order",userorder);
			model.addAttribute("cartid",cartid);
		//	return "orderdetails";
			return mv;
		}
		
		@RequestMapping("/cart/confirm/{cartid}")
		public ModelAndView confirm(@ModelAttribute UserOrder order,@PathVariable int cartid,Model model)
		{
			ModelAndView mv=new ModelAndView("index");	
			   mv.addObject("userClickConfirmOrder", true);
			   mv.addObject("title", "Visit Again!");
			   
			   model.addAttribute("order",order);
			  
			   
			cartitemDAOImpl.removeAllCartItem(cartid);
			//return "thanks";
		   return mv;
		}

}
