package com.klm.api.operations.roster;

public class OperationRoster {
	private final long employeeId;
    private final String employeeName;
    
    
    public OperationRoster(long employeeId, String employeeName) {
    	this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
