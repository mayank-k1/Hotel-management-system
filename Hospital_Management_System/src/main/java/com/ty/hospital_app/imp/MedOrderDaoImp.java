package com.ty.hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedorderDao;
import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.MedOrder;

public class MedOrderDaoImp implements MedorderDao {

	public MedOrder saveMedOrder(int eid, MedOrder medorder) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital =entityManager.find(Hospital.class,eid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();
			return medorder;
		}
		else
		{
			return null;
		}
	}

	public MedOrder getMedOrderById(int mid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder =entityManager.find(MedOrder.class,mid);
		
		return medorder;
	}

	public boolean deleteMedOrderId(int mid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder=entityManager.find(MedOrder.class,mid);
		if(medorder!=null)
		{
			entityTransaction.begin();
			entityManager.remove(medorder);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public MedOrder updateMedorder(int mid, MedOrder medorder) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		MedOrder medorder1=entityManager.find(MedOrder.class,mid);
		if(medorder1!=null)
		{
			
			medorder1.setDname(medorder1.getDname());
			medorder1.setOrderDate(medorder1.getOrderDate());
			entityTransaction.begin();
			entityManager.merge(medorder1);
			entityTransaction.commit();
			return medorder1;
		}
		else
		{
			return null;
		}
	}

	public List<MedOrder> getAllMedOrder() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from MedOrder s");
		List<MedOrder> medorder=query.getResultList();
		return medorder;
	}

	public List<MedOrder> getMedOrderByDocName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
