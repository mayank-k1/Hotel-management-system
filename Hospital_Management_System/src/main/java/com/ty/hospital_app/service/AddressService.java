package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Address;
import com.ty.hospital_app.imp.AddressDaoImp;

public class AddressService {
	public void saveAddress(Address address, int bid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.saveAddress(bid, address);
		if(address1!=null)
		{
			System.out.println("address saved");
		}
		else
		{
			System.out.println("address not found");
		}
	}
	public Address getAddressById(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.getAddressById(aid);
		if(address1!=null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	public void deleteBranchById(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean flag=daoImp.deleteAddressid(aid);
		if(flag)
		{
			System.out.println("address deleted");
		}
		else
		{
			System.out.println("address not found");
		}
	}
	public Address updateAddressById(int aid,Address address)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address1=daoImp.updateAddress(aid,address);
		if(address1!=null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}

}
