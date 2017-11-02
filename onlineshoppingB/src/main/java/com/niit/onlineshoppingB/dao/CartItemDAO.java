package com.niit.onlineshoppingB.dao;

import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.CartItem;

public interface CartItemDAO {
	 void addCartItem(CartItem cartItem);
	 void removeCartItem(int cartItemId);
     void removeAllCartItem(int cartid);
	 Cart getCart(int cartid);
}
