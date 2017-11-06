package com.klm.myroster.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.klm.myroster.model.Roster;
import com.klm.myroster.repository.CsvRepository;
import com.klm.myroster.services.RosterServices;

@RestController
public class RosterController {

	
	RosterServices rosterService = new RosterServices();
	
	
	@RequestMapping(value = "/v1/employee/{employeeNumber}", method = RequestMethod.GET)	
	public List <Roster> getRosters(@PathVariable String employeeNumber){ 
			CsvRepository.storeData();
		return rosterService.getSpecificEmployeeRosters(employeeNumber);
	}
	
}

