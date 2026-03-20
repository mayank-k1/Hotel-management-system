package com.ty;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class TestSavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("vikas");//establish a connection
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();                    //CRUD operation
		EntityTransaction entitytransaction =entitymanager.getTransaction();                         //manage transaction
		Person p1 = new Person();
		p1.setName("utkarsh");
		p1.setAge(24); 
		p1.setGender("male");
		p1.setPhno(777);	
		
		Person p2=new Person();
		p2.setName("robbin");
		p2.setAge(24);
		p2.setGender("male");
		p2.setPhno(75754);
		entitytransaction.begin();   //start
		entitymanager.persist(p1);	 // save the data
//		entitymanager.remove(p1);    // delete the data
//		entitymanager.merge(p1);     // update the data
//		entitymanager.find(p1);      //get the data
		entitymanager.persist(p2);
		entitytransaction.commit(); ///end
	}
}
