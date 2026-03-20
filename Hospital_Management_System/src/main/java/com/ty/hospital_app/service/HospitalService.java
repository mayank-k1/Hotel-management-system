package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.imp.HospitalDaoImp;

public class HospitalService {
	public void saveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.saveHospital(hospital);
		if(hospital1!=null)
		{
			System.out.println("hospital saved");
		}
		else
		{
			System.out.println("data not saved");
		}
	}
	public Hospital getHospitalById(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.getHospitalById(hid);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	public void deleteHospitalById(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean flag=daoImp.deleteHospitalId(hid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("hospital data not found");
		}
	}
	public Hospital updateHospitalById(int hid,Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital1=daoImp.updatedHospital(hid, hospital);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
		
	}

}