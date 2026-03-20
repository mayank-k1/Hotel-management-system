package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.imp.BranchDaoImp;
import com.ty.hospital_app.imp.PersonDaoImp;

public class PersonService {

	public void savePerson(Person person,int eid)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.savePerson(eid, person);
		if(person1!=null)
		{
			System.out.println("person saved");
		}
		else
		{
			System.out.println("person not saved");
		}
	}
	public Person getPersonById(int pid){
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.getPersonById(pid);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public void deletePersonById(int pid)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		boolean flag=daoImp.deletePersonId(pid);
		if(flag)
		{
			System.out.println("person deleted");
		}
		else
		{
			System.out.println("person data not found");
		}
	}
	public Person updatePersonById(int pid,Person person)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person1=daoImp.updatePerson(pid, person);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
}
