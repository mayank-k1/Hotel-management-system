package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("robbin");
		person.setPhno(758284556);
		
		Person person1=new Person();
		person1.setName("mayank");
		person1.setPhno(758280056);
		
		Person person2=new Person();
		person2.setName("monish");
		person2.setPhno(758287556);
		
		Cab cab=new Cab();
		cab.setDname("prime sedan");
		cab.setCost(800);
		
		Cab cab1=new Cab();
		cab1.setDname("sedan");
		cab1.setCost(500);
		
		Cab cab2=new Cab();
		cab2.setDname("omini");
		cab2.setCost(100);
		
		List<Cab> list=new ArrayList<Cab>();
		list.add(cab);
		list.add(cab1);
		list.add(cab2);
		
		List<Cab> list1=new ArrayList<Cab>();
		list1.add(cab);
		list1.add(cab1);
		list1.add(cab2);
		
		person.setCabs(list);
		person1.setCabs(list1);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(cab);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityTransaction.commit();
	}

}
