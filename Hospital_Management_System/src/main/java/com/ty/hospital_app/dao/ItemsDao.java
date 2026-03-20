package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemsDao {

	public Item saveItemId(int mid,Item items);
	
	public Item getItemById(int iid);
	
	public boolean deleteItemId(int iid);
	
	public Item updateItem(int iid,Item items);
	
	public List<Item> getAllItems();
}
