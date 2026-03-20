package com.ty.hospital_app.dao;

import java.util.List;
import com.ty.hospital_app.dto.Encounter;

public interface EncounterDao {

	public Encounter saveEncounter(int bid,Encounter encounter);
	
	public Encounter getEncounterById(int eid);
	
	public boolean delelteEncounterId(int eid);
	
	public Encounter updateEncounter(int eid,Encounter encounter);
	
	public List<Encounter> getAllEncounter();
}
