package com.ty.hospital_app.service;

import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.imp.ItemDaoImp;

public class ItemService {

	public void saveItems(Item items,int eid)
	{
		ItemDaoImp daoImp=new ItemDaoImp();
		Item items1=daoImp.saveItemId(eid, items);
		if(items1!=null)
		{
			System.out.println("item saved");
		}
		else
		{
			System.out.println("items not found");
		}
	}
	public void deleteItemById(int iid)
	{
		ItemDaoImp daoImp=new ItemDaoImp();
		boolean flag=daoImp.deleteItemId(iid);
		if(flag)
		{
			System.out.println("item deleted");
		}
		else
		{
			System.out.println("item not found");
		}
	}
	public Item updateItemById(int iid,Item items)
	{
		ItemDaoImp daoImp=new ItemDaoImp();
		Item items1=daoImp.updateItem(iid, items);
		if(items1!=null)
		{
			return items1;
		}
		else
		{
			return null;
		}
	}
}
