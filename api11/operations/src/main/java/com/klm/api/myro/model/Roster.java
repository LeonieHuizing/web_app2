package com.klm.api.myro.model;

public class Roster {

	private String id;
	private String name;
	private String title;
	private String startDate;
	private String endDate;
	

	public Roster(){
		
	}
	
	public Roster(String id, String name, String title, String startDate, String endDate) {
		this.id = id;
		this.setName(name);
		this.setTitle(title);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
	
	}
	
	//GETTER AND SETTERS
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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


}
