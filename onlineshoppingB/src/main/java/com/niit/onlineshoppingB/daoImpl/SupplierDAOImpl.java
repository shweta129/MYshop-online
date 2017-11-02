package com.niit.onlineshoppingB.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.onlineshoppingB.dao.SupplierDAO;
import com.niit.onlineshoppingB.dto.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void insertUpdateSupplier(Supplier supplier) {

		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(supplier);

	}

	@Override
	public Supplier getSupplier(int suppid) {
		Session session= sessionFactory.openSession();
    	Supplier supplier=(Supplier)session.get(Supplier.class,suppid);
    	session.close();
    	return supplier;
	}

	@Override
	public void deleteSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().delete(supplier);

	}

	@Override
	public List<Supplier> getSupplierDetails() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> list=query.list();
		session.close();
		return list;
	}

}
