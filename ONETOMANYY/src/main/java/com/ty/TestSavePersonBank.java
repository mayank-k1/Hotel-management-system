package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person persons=new Person();
		persons.setName("robbin");
		persons.setPhno(73812236);
		persons.setGender("male");

		Person persons1=new Person();
		persons1.setName("robbin");
		persons1.setPhno(73812236);
		persons1.setGender("male");
		
		Bank banks=new Bank();
		banks.setBname("SBI");
		banks.setLoc("MP");
		banks.setPhno(75824444);
		banks.setIfsc("sbi758");

		List<Bank> l1=new ArrayList<Bank>();
		l1.add(banks);
		
		List<Bank> l2=new ArrayList<Bank>();
		l2.add(banks);
		
		persons.setBanks(l1);
		persons1.setBanks(l2);
		
		entityTransaction.begin();
		entityManager.persist(persons);
		entityManager.persist(persons1);
		entityManager.persist(banks);
		entityTransaction.commit();
		
	}

}
