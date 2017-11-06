/**
 * Each instance of the object "Roster" is used to parse to the front-end (Ionic).
 * Each instance will represent a workshift for a KLM employee.
 */

package com.klm.myroster.model;

public class Roster {
	private String name;
	private String startDate;
	private String endDate;
	private String title;
	private String employeeNumber;
	
	public Roster() {
	}
	
	public Roster(String name, String title, String startDate, String endDate, String employeeNumber) {
		this.setName(name);
		this.setTitle(title);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setEmployeeNumber(employeeNumber);
	
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
}
