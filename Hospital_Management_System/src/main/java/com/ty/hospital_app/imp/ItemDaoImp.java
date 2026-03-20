package com.ty.hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemsDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Item;

public class ItemDaoImp implements ItemsDao{

	public Item saveItemId(int mid, Item items) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital =entityManager.find(Hospital.class,mid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(items);
			entityTransaction.commit();
			return items;
		}
		else
		{
			return null;
		}
	}

	public Item getItemById(int iid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items =entityManager.find(Item.class,iid);
		
		return items;
	}

	public boolean deleteItemId(int iid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items=entityManager.find(Item.class,iid);
		if(items!=null)
		{
			entityTransaction.begin();
			entityManager.remove(items);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int iid, Item items) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item items1=entityManager.find(Item.class,iid);
		if(items1!=null)
		{
			
			items1.setCost(items1.getCost());
			items1.setName(items1.getName());
			items1.setQuantity(items.getQuantity());
			entityTransaction.begin();
			entityManager.merge(items1);
			entityTransaction.commit();
			return items1;
		}
		else
		{
			return null;
		}
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Item s");
		List<Item> items=query.getResultList();
		return items;
	}

}
