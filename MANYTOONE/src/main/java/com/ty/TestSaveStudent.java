package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Strudent student=new Strudent();
		student.setName("robbin");
		student.setAge(24);
		student.setMarks(80);
		student.setGender("male");

		Strudent student1=new Strudent();
		student1.setName("monish lala");
		student1.setAge(24);
		student1.setMarks(90);
		student1.setGender("male");

		Strudent student2=new Strudent();
		student2.setName("nandanee");
		student2.setAge(23);
		student2.setMarks(94);
		student2.setGender("female");

		Strudent student3=new Strudent();
		student3.setName("divya bhudriya");
		student3.setAge(101);
		student3.setMarks(90);
		student3.setGender("female");
		
		College college=new College();
		college.setName("JEC");
		college.setWebsite("www.jec.org");
		college.setLocation("JBP");
		
		College college1=new College();
		college1.setName("GMSC");
		college1.setWebsite("www.gmsc.org");
		college1.setLocation("JBP");
		
		student.setColleges(college);
		student1.setColleges(college);
		student2.setColleges(college);
		student3.setColleges(college);
		
		student.setColleges(college1);
		student1.setColleges(college1);
		student2.setColleges(college1);
		student3.setColleges(college1);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(college);
		entityManager.persist(college1);
		entityTransaction.commit();
		
	}

}
