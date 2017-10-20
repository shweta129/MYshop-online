package com.niit.onlineshoppingB.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.UserDAO;
import com.niit.onlineshoppingB.dto.Address;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.User;



@Repository("userDAO")
@Transactional   //all methods are run under transaction
public class UserDAOImpl implements UserDAO   {

	
	@Autowired
	private SessionFactory SessionFactory;
	
	
	
	@Override
	public boolean addUser(User user) {
try {
			
			SessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;	
		}
		
	}

	@Override
	public boolean addAddress(Address address) {
		
try {
			
			SessionFactory.getCurrentSession().persist(address);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;	
		}
	}

	@Override
	public boolean updateCart(Cart cart) {
		
	
try {
			
			SessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;	
		}
	}

	//@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email = :email";		
		try {
			
			return SessionFactory.getCurrentSession()
						.createQuery(selectQuery,User.class)
							.setParameter("email", email)
								.getSingleResult();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}

	//@Override
	public Address getBillingAddress(User user) {
String selectQuery = "FROM Address WHERE user = :user AND billing = :billing";
		
		try {
			return SessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("user", user)
							.setParameter("billing", true)
							.getSingleResult();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Address> listShippingAddresses(User user) {
String selectQuery = "FROM Address WHERE user = :user AND shipping = :shipping";
		
		try {
			return SessionFactory.getCurrentSession()
						.createQuery(selectQuery, Address.class)
							.setParameter("user", user)
							.setParameter("shipping", true)
							.getResultList();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}