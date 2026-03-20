package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Encounter;
import com.ty.hospital_app.imp.EncounterDaoImp;

public class EncounterService {

	public void saveEncounter(Encounter encounter,int bid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.saveEncounter(bid, encounter);
		if(encounter1!=null)
		{
			System.out.println("encounter saved");
		}
		else
		{
			System.out.println("encoutner not saved");
		}
			
	}
	public Encounter getEncounterById(int bid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.getEncounterById(bid);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public void deleteEnconter(int eid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean flag=daoImp.delelteEncounterId(eid);
		if(flag)
		{
			System.out.println("encounter deleted");
		}
		else
		{
			System.out.println("encounter not found");
		}
	}
	public Encounter updateEncounterById(int eid,Encounter encounter)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter1=daoImp.updateEncounter(eid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
}
