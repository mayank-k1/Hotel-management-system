package com.ty;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
public class UpdatePerson {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager =  entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Person p1 = entityManager.find(Person.class,3);
	p1.setName("Aditi");
	entityTransaction.begin();
	entityManager.merge(p1);
	entityTransaction.commit();
	
}
}