package com.ty;

import java.util.ArrayList;
import java.util.List;

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
		
		Student s=new Student();
		s.setName("swantrant");
		s.setPhno(754120441);
		s.setMarks(86);
		s.setAge(24);
		
		Student s1=new Student();
		s1.setName("monish lala");
		s1.setPhno(754120441);
		s1.setMarks(86);
		s1.setAge(24);
		

		Student s2=new Student();
		s2.setName("ravi");
		s2.setPhno(754120441);
		s2.setMarks(96);
		s2.setAge(24);
		
		Student s3=new Student();
		s3.setName("satyam");
		s3.setPhno(754120441);
		s3.setMarks(96);
		s3.setAge(24);
		
		
		Course c=new Course();
		c.setName("sql");
		c.setFees(25000);
		c.setTrainer("mk");
		
		Course c1=new Course();
		c1.setName("java");
		c1.setFees(25000);
		c1.setTrainer("vk");
		
		Course c2=new Course();
		c2.setName("sql");
		c2.setFees(25000);
		c2.setTrainer("mk");
		
		Course c3=new Course();
		c3.setName("sql");
		c3.setFees(25000);
		c3.setTrainer("mk");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s);
		list.add(s1);
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(s2);
		list1.add(s3);
		
		List<Course> list3=new ArrayList<Course>();
		list3.add(c);
		list3.add(c1);
		
		List<Course> list4=new ArrayList<Course>();
		list4.add(c2);
		list4.add(c3);
		
		s.setCourse(list3);
		s1.setCourse(list4);
		s2.setCourse(list3);
		s3.setCourse(list4);
		
		c.setStudetns(list);
		c1.setStudetns(list1);
		c2.setStudetns(list);
		c.setStudetns(list1);
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(c);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityTransaction.commit();
		
	}

}
