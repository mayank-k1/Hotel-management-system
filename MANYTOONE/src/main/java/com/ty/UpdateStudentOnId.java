package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudentOnId {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Strudent student=entityManager.find(Strudent.class, 1);
		student.setMarks(96.2);
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("not found");
		}
	}
	
}
