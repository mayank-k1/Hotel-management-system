package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.MedOrder;

public interface MedorderDao {

	public MedOrder saveMedOrder(int eid,MedOrder medorder);
	
	public MedOrder getMedOrderById(int mid);
	
	public boolean deleteMedOrderId(int mid);
	
	public MedOrder updateMedorder(int mid,MedOrder medorder);
	
	public List<MedOrder> getAllMedOrder();
	
	public List<MedOrder> getMedOrderByDocName(String name);
}
