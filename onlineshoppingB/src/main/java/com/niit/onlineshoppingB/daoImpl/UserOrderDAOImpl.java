package com.niit.onlineshoppingB.daoImpl;


import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.UserOrderDAO;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.CartItem;
import com.niit.onlineshoppingB.dto.UserDetail;
import com.niit.onlineshoppingB.dto.UserOrder;

@Repository("userOrderDAO")
@Transactional
public class UserOrderDAOImpl implements UserOrderDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public UserOrder createOrder(Cart cart) {
		
		Session session=sessionFactory.getCurrentSession();
		//Cart cart=(Cart)session.get(Cart.class,cartid);
		List<CartItem> cartItems = cart.getCartItems();
		//List<CartItem> cartItems=cart.getCartItems();
		double grandTotal=0;
		for(CartItem cartItem:cartItems){
			grandTotal=cartItem.getTotalPrice()+grandTotal;
		}
		cart.setGrandTotal(grandTotal);
		UserDetail userdetail=cart.getUserdetail();
		UserOrder userorder=new UserOrder();
		userorder.setPurchaseDate(new Date());
		userorder.setCart(cart);
		//userdetail.setAddress(userdetail.getAddress());
		userorder.setUserdetail(userdetail);
		
		
		session.save(userorder);//insert, also execute update queries for other tables
		  return userorder;
	}

}
