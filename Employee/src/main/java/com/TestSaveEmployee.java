package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmployee {

	public static void main(String[] args) {

		EntityManagerFactory enmfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=enmfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee e1=new Employee();
		e1.setFirstName("mayank");
		e1.setLastName("kumar");
		
		
		Employee e2=new Employee();
		e2.setFirstName("nandanee");
		e2.setLastName("gokhale");
		
		entityTransaction.begin();
		entityManager.persist(e1);
		entityManager.persist(e2);
		entityTransaction.commit();
	}
}
