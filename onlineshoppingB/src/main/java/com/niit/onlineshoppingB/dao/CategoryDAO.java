package com.niit.onlineshoppingB.dao;

import java.util.List;

import com.niit.onlineshoppingB.dto.Category;

public interface CategoryDAO 
{  
	Category get(int id);
	
	List<Category> list();
	
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
	
}
