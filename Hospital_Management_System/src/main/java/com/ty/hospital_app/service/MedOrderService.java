package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.MedorderDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.MedOrder;
import com.ty.hospital_app.imp.BranchDaoImp;
import com.ty.hospital_app.imp.MedOrderDaoImp;

public class MedOrderService {
	public void saveMedOrder(MedOrder medorder,int eid)
	{
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medOrder1=daoImp.saveMedOrder(eid, medorder);
		if(medOrder1!=null)
		{
			System.out.println("medorder saved");
			
		}
		else
		{
			System.out.println("Medorder not saved");
		}
	}
	public MedOrder getBranchById(int mid){
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medorder1=daoImp.getMedOrderById(mid);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	public void deleteMedOrderById(int mid)
	{
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		boolean flag=daoImp.deleteMedOrderId(mid);
		if(flag)
		{
			System.out.println("medorder deleted");
		}
		else
		{
			System.out.println("medorder data not found");
		}
	}
	public MedOrder updateBranchById(int mid,MedOrder medorder)
	{
		MedOrderDaoImp daoImp=new MedOrderDaoImp();
		MedOrder medorder1=daoImp.updateMedorder(mid, medorder);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
}
