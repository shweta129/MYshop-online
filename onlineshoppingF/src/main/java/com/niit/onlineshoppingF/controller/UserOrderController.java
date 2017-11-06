package com.niit.onlineshoppingF.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.onlineshoppingB.dao.CartItemDAO;
import com.niit.onlineshoppingB.dao.UserOrderDAO;
import com.niit.onlineshoppingB.daoImpl.CartItemDAOImpl;
import com.niit.onlineshoppingB.daoImpl.UserOrderDAOImpl;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.UserDetail;
import com.niit.onlineshoppingB.dto.UserOrder;

@Controller
public class UserOrderController {

	@Autowired
	 UserOrderDAO userorderDAO;
	 @Autowired
	 CartItemDAO cartitemDAO;

	 @RequestMapping("/cart/{cartid}/order")
		public ModelAndView createOrder(@PathVariable int cartid,Model model)
		{
			   ModelAndView mv=new ModelAndView("page");
			   mv.addObject("userClickOrder", true);
			   mv.addObject("title", "Order");
				Cart cart=cartitemDAO.getCart(cartid);
				UserDetail userdetail=cart.getUserdetail();
			    cart.setUserdetail(userdetail);
			UserOrder userorder=userorderDAO.createOrder(cart);
			model.addAttribute("cart",cart);
			model.addAttribute("order",userorder);
			model.addAttribute("cartid",cartid);
		
			return mv;
		}
		
		@RequestMapping("/cart/confirm/{cartid}")
		public ModelAndView confirm(@ModelAttribute UserOrder order,@PathVariable int cartid,Model model)
		{
			ModelAndView mv=new ModelAndView("page");	
			   mv.addObject("userClickConfirmOrder", true);
			   mv.addObject("title", "Visit Again!");
			   
			   model.addAttribute("order",order);
			  
			   
			cartitemDAO.removeAllCartItem(cartid);
			//return "thanks";
		   return mv;
		}

}
