package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSaveMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Mobile mobile= new Mobile();
		mobile.setBrand("MI");
		mobile.setCost(26000);
		mobile.setColor("black");
		mobile.setRam("4g");

		Mobile mobile1= new Mobile();
		mobile1.setBrand("Oopo");
		mobile1.setCost(22000);
		mobile1.setColor("pink");
		mobile1.setRam("4g");

		Mobile mobile2= new Mobile();
		mobile2.setBrand("iphone");
		mobile2.setCost(22000);
		mobile2.setColor("pink");
		mobile2.setRam("4g");

		Mobile mobile3= new Mobile();
		mobile3.setBrand("onepluse");
		mobile3.setCost(22000);
		mobile3.setColor("pink");
		mobile3.setRam("4g");

		Sim sim=new Sim();
		sim.setProvider("airtel");
		sim.setType("4g");
		sim.setCoste(250);
		sim.setPhno(758245663);

		Sim sim1=new Sim();
		sim1.setProvider("jio");
		sim1.setType("4g");
		sim1.setCoste(250);
		sim1.setPhno(758245663);

		Sim sim2=new Sim();
		sim2.setProvider("airtel");
		sim2.setType("4g");
		sim2.setCoste(250);
		sim2.setPhno(758245663);

		Sim sim3=new Sim();
		sim3.setProvider("airtel");
		sim3.setType("4g");
		sim3.setCoste(250);
		sim3.setPhno(758245663);

		List<Sim> list=new ArrayList<Sim>();
		list.add(sim);
		list.add(sim1);

		List<Sim> list1=new ArrayList<Sim>();
		list.add(sim2);
		list.add(sim3);

		mobile.setSims(list);
		mobile1.setSims(list1);
		

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(mobile1);
		entityManager.persist(mobile2);
		entityManager.persist(mobile3);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityTransaction.commit();
		//		Mobile mobile=entityManager.find(Mobile.class, 1);
		//		System.out.println(mobile.getId());
	}

}
