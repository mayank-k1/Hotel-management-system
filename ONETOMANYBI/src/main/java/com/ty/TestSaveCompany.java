package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Company companies=new Company();
		companies.setName("Infosys");
		companies.setWebsite("www.info.com");
		companies.setLoc("MP");
		
		Company companies1=new Company();
		companies1.setName("Infosys");
		companies1.setWebsite("www.info.com");
		companies1.setLoc("MP");
		
		Gst gst=new Gst();
		gst.setGstno(111);
		gst.setState("MP");
		gst.setCountry("India");
		
		Gst gst1=new Gst();
		gst1.setGstno(111);
		gst1.setState("MP");
		gst1.setCountry("India");
		
		companies.setGst(gst);
		companies1.setGst(gst1);
		
		gst.setCompanies(companies);
		gst1.setCompanies(companies1);
		
		entityTransaction.begin();
		entityManager.persist(companies);
		entityManager.persist(companies1);
		entityManager.persist(gst);
		entityManager.persist(gst1);
		entityTransaction.commit();
	}
}