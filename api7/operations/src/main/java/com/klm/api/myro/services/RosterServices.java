package com.klm.api.myro.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.klm.api.myro.database.Database;
import com.klm.api.myro.model.Roster;

public class RosterServices {
	
	private Map<String, Roster> rosters = Database.getRosters();
	private Map<String, Roster> rosterX = Database.getSpecificRoster();

	public RosterServices(){
		//rosters.put(1L, new Roster(1, "hello", "jan"));
		//rosters.put(2L, new Roster(2, "Bye", "Beta"));
		//rosters.put(3L, new Roster(3, "Adios", "Beta"));
		
	}
	
	public List<Roster> getAllRosters(){
		return new ArrayList<Roster>(rosters.values());
	}
	
	public List<Roster> getSpecificRoster(){
		return new ArrayList<Roster>(rosterX.values());
		
		
	}
	
	//ADD GET,POST, PUT, DELETE methods
	public Roster getRoster(String id){
		return rosters.get(id);
	}
	
}
