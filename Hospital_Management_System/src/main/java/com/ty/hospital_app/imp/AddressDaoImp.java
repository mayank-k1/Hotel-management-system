package com.ty.hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.AddressDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class AddressDaoImp implements AddressDao{

	public Address saveAddress(int bid, Address address) {
		// TODO Auto-generated 
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital =entityManager.find(Hospital.class,bid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
			return address;
		}
		else
		{
			return null;
		}
	}

	public Address getAddressById(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address =entityManager.find(Address.class,aid);
		
		return address;
	}

	public boolean deleteAddressid(int aid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address=entityManager.find(Address.class,aid);
		if(address!=null)
		{
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Address updateAddress(int aid, Address address) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Address address1=entityManager.find(Address.class,aid);
		if(address1!=null)
		{
			
			address1.setCountry(address1.getCountry());
			address1.setState(address1.getState());
			address1.setStreet(address1.getStreet());
			address1.setPincode(address1.getPincode());
			entityTransaction.begin();
			entityManager.merge(address1);
			entityTransaction.commit();
			return address1;
		}
		else
		{
			return null;
		}
	}

	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Address s");
		List<Address> address=query.getResultList();
		return address;
		
	}

	
}
