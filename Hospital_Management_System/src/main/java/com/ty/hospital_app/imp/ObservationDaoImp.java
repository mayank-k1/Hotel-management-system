package com.ty.hospital_app.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ObservationDao;
import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Observation;

public class ObservationDaoImp implements ObservationDao{

	public Observation saveObservation(int eid, Observation observation) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital =entityManager.find(Hospital.class,eid);
		if(observation!=null)
		{
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		}
		else
		{
			return null;
		}
	}

	public Observation getObservationById(int oid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation =entityManager.find(Observation.class,oid);

		return observation;
	}

	public boolean deleteObservationId(int oid) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation =entityManager.find(Observation.class,oid);
		if(observation!=null)
		{
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}

	}

	public Observation updateObservation(int oid, Observation observation) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Observation observation1=entityManager.find(Observation.class,oid);
		if(observation1!=null)
		{

			observation1.setDname(observation1.getDname());
			observation1.setEncounter(observation1.getEncounter());
			observation1.setRobservation(observation.getRobservation());
			entityTransaction.begin();
			entityManager.merge(observation1);
			entityTransaction.commit();
			return observation1;
		}
		else
		{
			return null;
		}
	}

	public List<Observation> getAllObservation() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Observation s");
		List<Observation> observation=query.getResultList();
		return observation;
	}

	public List<Observation> getOvservationbyDocName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
