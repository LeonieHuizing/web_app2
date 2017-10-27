package com.klm.api.operations.controller;

import com.klm.api.operations.roster.OperationRoster;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class OperationController {

	@RequestMapping(value = "/v1/employee/{employeeId}&callback=JSONP_CALLBACK", method = RequestMethod.GET)
    public OperationRoster getOperationRosterForEmployee(@PathVariable("employeeId") long employeeId) { 	
    	return new OperationRoster(employeeId, "leonie");
    }
    
}  