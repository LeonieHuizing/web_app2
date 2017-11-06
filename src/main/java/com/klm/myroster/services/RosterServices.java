package com.klm.myroster.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.klm.myroster.model.Roster;
import com.klm.myroster.repository.CsvRepository;

public class RosterServices {

	private Map<Long, Roster> rosters = CsvRepository.getSpecificRoster();
	
	public RosterServices(){
		
	}
	
	//ADD GET,POST, PUT, DELETE methods
	public List<Roster> getSpecificEmployeeRosters(String employeeNumber){	
	    List <Roster> employeeRoster = rosters.values()
			.stream()
			.filter(x-> employeeNumber.equals(x.getEmployeeNumber()))
			.collect(Collectors.toList());
	    return employeeRoster;
	}
}
