package com.niit.onlineshoppingB.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.onlineshoppingB.dao.UserDAO;

import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.UserDetail;

public class UserTestCase {

	
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private UserDetail userdetail = null;
	private Cart cart = null;
	
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.onlineshoppingB");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
		
	}
	
	
/*	@Test
	public  void testAdd() {
		
		user = new User();
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("123456");
		
		//add the user
		assertEquals("Failed to add user!",true,userDAO.addUser(user));
	
	
	address = new Address();
	address.setAddressLineOne("101/B Jadoo Society,Krissh Nagar");
	address.setAddressLineTwo("Near Kaabil Store");
	address.setCity("Mumbai");
	address.setState("Maharashtra");
	address.setCountry("India");
	address.setPostalCode("400001");
	address.setBilling(true);
	
	//link the user with the address using user id
	address.setUserId(user.getId());
	
	//add the address
     assertEquals("Failed to add address!",true,userDAO.addAddress(address));
	
	
if(user.getRole().equals("USER")) {
    	 
    	 //create a cart for this user
    	 cart = new Cart();
    	 
    	 cart.setUser(user);
    	 
    	 //add the cart
    assertEquals("Failed to add cart!",true,userDAO.addCart(cart));
	
//add a shipping address for this user
    
    address = new Address();
    address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
    address.setAddressLineTwo("Near Kudrat Store");
    address.setCity("Mumbai");
    address.setState("Maharashtra");
    address.setCountry("India");
    address.setPostalCode("400001");
    //set shipping  to true
	address.setBilling(true);
	
	//link it with the user
	
	address.setUserId(user.getId());
	
	//add the shipping address
    assertEquals("Failed to add shipping address!",true,userDAO.addAddress(address));
}
}*/
	
/*	@Test
	public  void testAdd() {
		
		user = new User();
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("123456");
		

if(user.getRole().equals("USER")) {
    	 
    	 //create a cart for this user
    	 cart = new Cart();
    	 
    	 cart.setUser(user);
    	 
    	 //attach cart with user
   	  user.setCart(cart);   	 
}

//add the user
assertEquals("Failed to add user!",true,userDAO.addUser(user));
}
	*/
	
	@Test
	public  void testAdd() {
		
		userdetail = new UserDetail();
		userdetail.setFirstName("Sandy");
		userdetail.setLastName("patil");
		userdetail.setEmail("s@gmail.com");
		userdetail.setContactNumber("1234512345");
		userdetail.setRole("USER");
		userdetail.setPassword("12345");
		userdetail.setAddress("Thane");
		userdetail.setEnabled(true);

if(userdetail.getRole().equals("USER")) {
    	 
    	 //create a cart for this user
    	 cart = new Cart();
    	 
    	 cart.setUserdetail(userdetail);
    	 
    	 //attach cart with user
   	  userdetail.setCart(cart);   	 
}

//add the user
userDAO.addUser(userdetail);
}
	
	
/*@Test
	
	public void testUpdateCart() {
		
	//fetch the user by its email
		user = userDAO.getByEmail("hr@gmail.com");
		
		//get the cart of the user
		cart = user.getCart();
		
		cart.setGrandTotal(5555);
		cart.setCartLines(2);
		
	assertEquals("Failed to update the cart!",true,userDAO.updateCart(cart));
		
	
}*/
	
	/*@Test
	public void testAddAddress() 
	{
		//we need to add an user
		
		user = new User();
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("123456");
		
		//add the user
		assertEquals("Failed to add user!",true,userDAO.addUser(user));
	
	
	address = new Address();
	address.setAddressLineOne("101/B Jadoo Society,Krissh Nagar");
	address.setAddressLineTwo("Near Kaabil Store");
	address.setCity("Mumbai");
	address.setState("Maharashtra");
	address.setCountry("India");
	address.setPostalCode("400001");
	address.setBilling(true);
	
	
	//attach the user to the address
	
	address.setUser(user);
	assertEquals("Failed to add user!",true,userDAO.addAddress(address));
		
		
		//we are also going to add shipping address
	
	address = new Address();
    address.setAddressLineOne("201/B Jadoo Society, Kishan Kanhaiya Nagar");
    address.setAddressLineTwo("Near Kudrat Store");
    address.setCity("Mumbai");
    address.setState("Maharashtra");
    address.setCountry("India");
    address.setPostalCode("400001");
    //set shipping  to true
	address.setBilling(true);
	
	
	//attach the user to the address
	
		address.setUser(user);
		assertEquals("Failed to add shipping user!",true,userDAO.addAddress(address));
	}*/
	
	
	/*@Test
	public void testAddress() {
		
		user = userDAO.getByEmail("hr@gmail.com");
		
		//we are going to add the shipping address
				address = new Address();
			    address.setAddressLineOne("301/B Jadoo Society, Kishan Kanhaiya Nagar");
			    address.setAddressLineTwo("Near Kudrat Store");
			    address.setCity("Banglore");
			    address.setState("Karnataka");
			    address.setCountry("India");
			    address.setPostalCode("400001");
			    
			    //set shipping  to true
				address.setShipping(true);
				//attached user to address
				address.setUser(user);
				assertEquals("Failed to add shipping address!",true,userDAO.addAddress(address));
				
			}*/
	
	
	
}