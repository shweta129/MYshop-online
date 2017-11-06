package com.niit.onlineshoppingB.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserOrder {

	 @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int orderId;
	  private Date purchaseDate;
	  @ManyToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="cart_id")
	  private Cart cart;
	  @ManyToOne(cascade=CascadeType.ALL)
	  @JoinColumn(name="user_id")
	  private UserDetail userdetail;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public UserDetail getUserdetail() {
		return userdetail;
	}
	public void setUserdetail(UserDetail userdetail) {
		this.userdetail = userdetail;
	}
	

	  
	  
	  
	  
	}
