package com.niit.onlineshoppingB.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.UserDAO;
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
			
			Session session = SessionFactory.getCurrentSession();
			user.setEnabled(true);
			user.setRole("USER");
			Cart cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);
			session.persist(user);
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;	
		}
		
	}

	

	
	//@Override
	public User getByEmail(User email) {
		String selectQuery = "FROM User WHERE email = :email";		
		try {
			
			return SessionFactory.getCurrentSession()
						.createQuery(selectQuery,User.class)
							.setParameter("email", email)
								.getSingleResult();
			
		}
		catch(Exception ex) {
			//ex.printStackTrace();
			return null;
		}
		
		
	}




	@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM Useremail WHERE email = :useremail";
   	 try{
   		return SessionFactory.getCurrentSession()
   				.createQuery(selectQuery,User.class)
   				.setParameter("email", email)
   				.getSingleResult();
   	 }
   	catch(Exception ex)
   	 {
   		return null;
   	 }
	}





	
}