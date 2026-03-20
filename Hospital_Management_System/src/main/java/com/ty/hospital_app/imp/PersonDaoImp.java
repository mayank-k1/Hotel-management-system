package com.ty.hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.dto.Person;

public class PersonDaoImp implements PersonDao{

	public Person savePerson(int eid, Person person) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital =entityManager.find(Hospital.class,eid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}

	}

	public Person getPersonById(int pid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,pid);
		return person;
	}

	public boolean deletePersonId(int pid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class, pid);
		if(person!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int pid, Person person) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1=entityManager.find(Person.class,pid);
		if(person1!=null)
		{

			person1.setName(person1.getName());
			person1.setAddress(person1.getAddress());
			person1.setPhno(person1.getPhno());
			person1.setAge(person1.getAge());
			person1.setGender(person1.getGender());
			
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		else
		{
			return null;
		}
	}

	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> Person=query.getResultList();
		return Person;
	}

	public List<Person> getPersonByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getPersonByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getPersonByPhone(long Phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
