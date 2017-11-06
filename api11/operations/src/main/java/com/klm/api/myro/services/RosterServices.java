package com.klm.api.myro.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.klm.api.myro.database.Database;
import com.klm.api.myro.model.Roster;

public class RosterServices {
	
	private Map<String, Roster> rosters = Database.getRosters();

	public RosterServices(){
	}
	
	public List<Roster> getAllRosters(){
		return new ArrayList<Roster>(rosters.values());
	}
	
	//ADD GET,POST, PUT, DELETE methods
	public Roster getRoster(String id){
		return rosters.get(id);
	}
	
}
