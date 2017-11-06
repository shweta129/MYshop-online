package com.niit.onlineshoppingB.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.UserDAO;
import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.UserDetail;



@Repository("userDAO")
@Transactional   //all methods are run under transaction
public class UserDAOImpl implements UserDAO   {

	
	@Autowired
	private SessionFactory SessionFactory;
	
	
	
	@Override
	public void addUser(UserDetail userdetail)

	{	
			Session session = SessionFactory.getCurrentSession();
			userdetail.setEnabled(true);
			userdetail.setRole("USER");
			Cart cart = new Cart();
			cart.setUserdetail(userdetail);
			userdetail.setCart(cart);
			session.saveOrUpdate(userdetail);
			
		}
		
	

	

	
	//@Override
	public UserDetail getByEmail(String email) {
		String selectQuery = "FROM UserDetail WHERE email = :email";		
		try {
			
			return SessionFactory.getCurrentSession()
						.createQuery(selectQuery,UserDetail.class)
							.setParameter("email", email)
								.getSingleResult();
			
		}
		catch(Exception ex) {
			//ex.printStackTrace();
			return null;
		}
		
		
	}




	/*@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email = :email";
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
*/



	@Override
    @SuppressWarnings("deprecation")
	public UserDetail validateEmail(String email) {
		Session session=SessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 Query query=session.createQuery("from UserDetail where email=?");
		 query.setString(0, email);
		 UserDetail user=(UserDetail) query.uniqueResult(); 
		return user;
	}




	@Override
	@SuppressWarnings("deprecation")
	public UserDetail validatecontactNumber(String contactNumber) {
		Session session=SessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 Query query=session.createQuery("from UserDetail where contactNumber=?");
		 query.setString(0, contactNumber);
		 UserDetail user=(UserDetail) query.uniqueResult(); 
		return user;
	}




	


	
}