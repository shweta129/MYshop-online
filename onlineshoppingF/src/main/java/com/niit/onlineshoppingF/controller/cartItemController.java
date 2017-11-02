package com.niit.onlineshoppingF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.onlineshoppingB.dao.CartItemDAO;
import com.niit.onlineshoppingB.dao.ProductDAO;
import com.niit.onlineshoppingB.dao.UserDAO;
import com.niit.onlineshoppingB.daoImpl.CartItemDAOImpl;
import com.niit.onlineshoppingB.daoImpl.ProductDAOImpl;
import com.niit.onlineshoppingB.daoImpl.UserDAOImpl;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.CartItem;
import com.niit.onlineshoppingB.dto.Product;
import com.niit.onlineshoppingB.dto.User;

@Controller
public class cartItemController {

	 private static final String FirstName = null;
	    @Autowired
		ProductDAO productDAO;
	    
	    @Autowired
	    UserDAO userDAO;
	    
	    @Autowired
	   CartItemDAO cartItemDAO;
	    
	    
	   
	    public void CartItemController()
	    {
	    System.out.println("....");
	   
	    }
	    
	    
	      @RequestMapping("/cart/getcart")
	      public ModelAndView getCart(Model model)
	      {
	    	  System.out.println("get cart method");
	    	  ModelAndView mv=new ModelAndView("page");
	    	  mv.addObject("userClickCart", true);
	    	  mv.addObject("title", "Cart");
	      User user1=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	  		String email=user1.getEmail();
	  		 User user=userDAO.getByEmail(email);
	  		 System.out.println("get cart method after 57 line");
	  		Cart cart=user.getCart();
	  		 model.addAttribute("cart", cart);
	  		 return mv;
	      }
	    
	    
	    @RequestMapping("/cart/add/{id}/product")
		public String addCartItem(@PathVariable int id, @RequestParam int units,Model model)
		{
		  ModelAndView mv=new ModelAndView("page");
		   mv.addObject("userClickCart",true);
	       mv.addObject("title","Cart");
		  Product product=productDAO.get(id);
	   //To get the user details, get the Principal object from securitycontextholder
			System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
			User user1=(User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String email=user1.getEmail();
			 User user=userDAO.getByEmail(email);
			 Cart cart=user.getCart();
			 List<CartItem> cartItems=cart.getCartItems();
			 System.out.println(cart.getCartItems().size());
			 
			 //check purchased product is already existing in the cartitem table
			 for(CartItem cartItem:cartItems){
				 //productid in table (productid in the database) == id(input)
				 System.out.println(cartItem.getProduct().getId());
				 System.out.println(id);
				  if(cartItem.getProduct().getId()==id)
				  {
					  cartItem.setQuantity(units);
					  
					  
					 ///?????
					  cartItem.setTotalPrice(product.getUnitPrice() * units);
					  cartItemDAO.addCartItem(cartItem);//update cartitem units & totalprice
					  return "redirect:/cart/getcart";
				  }
				  
				  
			 }
			 CartItem cartItem=new CartItem();
	         cartItem.setQuantity(units);
	         cartItem.setTotalPrice(product.getUnitPrice() * units);
	         cartItem.setProduct(product);//product_id column in cartItem table
	         cartItem.setCart(cart);//cart_id column in cartitem table
	         cartItemDAO.addCartItem(cartItem);//insert
	         return "redirect:/cart/getcart";
			 
		}
			
		
		@RequestMapping("/cart/removecartitem/{cartItemId}")
			public String removeCartItem(@PathVariable int cartItemId)
		  {
			System.out.println("---Single CartItem Deleted----");
			 cartItemDAO.removeCartItem(cartItemId);
			return "redirect:/cart/getcart";
		  }
		
		
	    @RequestMapping("/cart/clearcart/{cartid}")
		public String removeAllCartItems(@PathVariable("cartid") int cartid)
	  {
	    	System.out.println("---Cart Deleted----");
		 cartItemDAO.removeAllCartItem(cartid);;
		return "redirect:/cart/getcart";
	  }
}	

