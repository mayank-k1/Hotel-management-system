package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.ObservationDao;
import com.ty.hospital_app.dto.Observation;
import com.ty.hospital_app.imp.ObservationDaoImp;

public class ObservationService {

	public void saveObservation(Observation observation,int eid )
	{
		ObservationDaoImp daoImp=new ObservationDaoImp(); 
		Observation observation1=daoImp.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("observation saved");
		}
		else
		{
			System.out.println("obsevation not saved");
		}
	}
	public Observation getObservationById(int oid)
	{
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation=daoImp.getObservationById(oid);
		if(observation!=null)
		{
			return observation;
		}
		else
		{
			return null;
		}
	}
	public void deleteObservationById(int oid)
	{
		ObservationDaoImp daoImp=new ObservationDaoImp();
		boolean flag=daoImp.deleteObservationId(oid);
		if(flag)
		{
			System.out.println("observation deleted");
		}
		else
		{
			System.out.println("observation data not found");
		}
	}
	public Observation updataObservationById(int oid,Observation observation)
	{
		ObservationDaoImp daoImp=new ObservationDaoImp();
		Observation observation1=daoImp.updateObservation(oid,observation);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
}
