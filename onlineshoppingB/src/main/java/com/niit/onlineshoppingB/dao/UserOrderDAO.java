package com.niit.onlineshoppingB.dao;

import com.niit.onlineshoppingB.dto.Cart;
import com.niit.onlineshoppingB.dto.UserOrder;

public interface UserOrderDAO {
	UserOrder createOrder(Cart cart);
}
