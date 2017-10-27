package com.niit.onlineshoppingF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.onlineshoppingB.dao.ProductDAO;
import com.niit.onlineshoppingB.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private ProductDAO productDAO; //get the product from ProductDAO
	
	@RequestMapping("/all/products")
	@ResponseBody
      public List<Product> getAllProducts()
      {
		return productDAO.listActiveProducts();
      }
	
	
	
	@RequestMapping("/admin/all/products")
	@ResponseBody
      public List<Product> getAllProductsForAdmin()
      {
		return productDAO.list();
      }
	
	
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
      public List<Product> getAllProductsByCategory(@PathVariable int id)
      {
		return productDAO.listActiveProductsByCategory(id);
      }
}
