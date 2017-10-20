package com.niit.onlineshoppingB.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.onlineshoppingB.dao.CategoryDAO;
import com.niit.onlineshoppingB.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;

	
	@BeforeClass
	
	public static void init(){
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.onlineshoppingB");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		
	} 
	
	/*@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Television's");
		category.setDescription("This is some discription for kid's dress");
		category.setImageURL("CAT_3.jpg");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}*/
	
	/*@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Mobile");
		category.setDescription("This is some discription for mobile dress");
		category.setImageURL("CAT_2.jpg");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}*/
	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		
		category.setName("Laptop");
		category.setDescription("This is some discription for Laptop");
		category.setImageURL("CAT_1.jpg");
		
		assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	}

}
	/*
	@Test
	public void testGetCategory()
	{
		category = categoryDAO.get(5);
		
		assertEquals("Successfully fetched a category from table","kid's",category.getName());
	}

	
	*/
  /* @Test
   public void testDeleteCategory() {
	   
	   category = categoryDAO.get(1);
	    
	   category.setName("Men's");
	    
	   assertEquals("Something went wrong while   updated a single category in table",true,categoryDAO.delete(category));
   }
	*/
	
	/* @Test
	   public void testDeleteCategory() {
		   
		 
    assertEquals("Something went wrong while fetched a list of category from table",6,categoryDAO.list().size());
	   }

	
	@Test
	  
	public  void testCRUDCategory(){
		//add operation
       category = new Category();
		
		category.setName("kid's");
		category.setDescription("This is some discription for kid's dress");
		category.setImageURL("CAT_3.jpg");
		//assertEquals("Something went wrong while  new  added category inside table",true,categoryDAO.add(category));
	
	
	 category = new Category();
		
		category.setName("Men's");
		category.setDescription("This is some discription for kid's dress");
		category.setImageURL("CAT_1.jpg");
		
		//assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	
	
		
		 category = new Category();
			
			category.setName("kid's");
			category.setDescription("This is some discription for kid's dress");
			category.setImageURL("CAT_3.jpg");
			
			//assertEquals("Successfully added category inside table",true,categoryDAO.add(category));
	
			// fetching and updating category 
			 category = categoryDAO.get(2);
			    
			   category.setName("Men's");
			    
			assertEquals("Successfully updated a single category in table",true,categoryDAO.update(category));
	
	
	       //delete the category
		  // assertEquals("Successfully delete a single category in table",true,categoryDAO.delete(category));
	
		   //fetch list
		  assertEquals("Successfully fetched a list of category from table",5,categoryDAO.list().size());
	}
	
}
*/