package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAdhar {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction entityTransaction=em.getTransaction();
		
		Person p1=new Person();
		p1.setDob("11feb2000");
		p1.setName("mayankkumar");
		
		AdharCard a1=new AdharCard();
		a1.setAdharno(900544332);
		
		p1.setAdhar(a1);
		entityTransaction.begin();
		em.persist(p1);
		em.persist(a1);
		entityTransaction.commit();
	}
}
