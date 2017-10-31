package com.klm.api.myro.resources;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.klm.api.myro.model.Roster;
import com.klm.api.myro.services.RosterServices;


@RestController
public class RosterResource {


	RosterServices rosterService = new RosterServices();
	
	
	@RequestMapping(value = "/v1/employee", method = RequestMethod.GET)	
	public List <Roster> getRosters(){
		return rosterService.getAllRosters();
	}
	
	@RequestMapping(value = "/v1/employee/{rosterId}", method = RequestMethod.GET)	
	public Roster test(@PathVariable("rosterId") long rosterId){
		return rosterService.getRoster(rosterId);
	}
	
}