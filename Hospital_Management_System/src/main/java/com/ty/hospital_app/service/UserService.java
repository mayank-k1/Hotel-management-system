package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.User;
import com.ty.hospital_app.imp.BranchDaoImp;
import com.ty.hospital_app.imp.UserDaoImp;

public class UserService {
	public void saveUser(User user,int eid)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.saveUser(user);
		if(user1!=null)
		{
			System.out.println("user saved");
		}
		else
		{
			System.out.println("user not saved");
		}
		
	}
	public User getUserById(int uid)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user=daoImp.getUserById(uid);
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
	}
	public void deleteUserById(int uid)
	{
		UserDaoImp daoImp=new UserDaoImp();
		boolean flag=daoImp.deleteUser(uid);
		if(flag)
		{
			System.out.println("user deleted");
		}
		else
		{
			System.out.println("user not found");
		}
	}
	public User updateUserById(int uid,User user)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user1=daoImp.updateUser(uid, user);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
}
