package com.niit.onlineshoppingB.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.CartItemDAO;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.CartItem;

@Repository("cartItemDAO")
@Transactional
public class CartItemDAOImpl implements CartItemDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCartItem(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);	
   
	}

	@Override
	public void removeCartItem(int cartItemId) {
		Session session=sessionFactory.getCurrentSession();
		CartItem cartItem=(CartItem)session.get(CartItem.class,cartItemId);
	    session.delete(cartItem);

	}

	@Override
	public void removeAllCartItem(int cartid) {

		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart) session.get(Cart.class, cartid);
		
		List<CartItem> cartItems=cart.getCartItems();
		for(CartItem cartItem:cartItems)
		{
			session.delete(cartItem);
		}
     
	}

	@Override
	public Cart getCart(int cartid) {
		
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class,cartid);
		return cart;
	}

}
