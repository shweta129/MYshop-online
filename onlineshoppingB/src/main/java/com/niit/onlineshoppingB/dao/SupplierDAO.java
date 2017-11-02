package com.niit.onlineshoppingB.dao;

import java.util.List;

import com.niit.onlineshoppingB.dto.Supplier;

public interface SupplierDAO {
	 void insertUpdateSupplier(Supplier supplier);
	 Supplier getSupplier(int suppid);
	 void deleteSupplier(Supplier supplier);
	 List<Supplier> getSupplierDetails();
}
