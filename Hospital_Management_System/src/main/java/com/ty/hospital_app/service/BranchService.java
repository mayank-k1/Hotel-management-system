package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.imp.BranchDaoImp;

public class BranchService {

	public void saveBranch(Branch branch,int hid)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.saveBracnh(hid, branch);
		if(branch1!=null)
		{
			System.out.println("branch saved");
		}
		else
		{
			System.out.println("branch not saved");
		}
	}
	public Branch getBranchById(int bid){
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.getBranchById(bid);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	public void deleteBranchById(int bid)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean flag=daoImp.deleteBranchId(bid);
		if(flag)
		{
			System.out.println("branch deleted");
		}
		else
		{
			System.out.println("branch data not found");
		}
	}
	public Branch updateBranchById(int bid,Branch branch)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch1=daoImp.updateBreanch(bid, branch);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
}
