package com.niit.onlineshoppingF.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.onlineshoppingB.dao.CartLineDAO;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.CartLine;
import com.niit.onlineshoppingF.model.UserModel;


@Service("cartService")
public class CartService {
	
	@Autowired
	private CartLineDAO cartLineDAO;
	
	@Autowired
	private HttpSession session;
	
	private Cart getCart() {
		
		return ((UserModel)session.getAttribute("userModel")).getCart();
		
	}
	
	public List<CartLine> getCartLines() {
		
		
		return cartLineDAO.list(this.getCart().getId());
	}

}
