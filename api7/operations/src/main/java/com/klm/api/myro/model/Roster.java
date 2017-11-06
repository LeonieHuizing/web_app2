package com.klm.api.myro.model;

public class Roster {

	private String id;
	private String name;
	private String startjaar;
	private String startmaand;
	private String startdag;
	private String startuur;
	private String startminuten;
	private String eindjaar;
	private String eindmaand;
	private String einddag;
	private String einduur;
	private String eindminuten;
	private String title;
	
	
	public Roster(){
		
	}
	
	public Roster(String id, String name, String startjaar, String startmaand, String startdag, String startuur, String startminuten, String eindjaar, String eindmaand, String einddag, String einduur, String eindminuten, String title) {
		this.id = id;
		this.setName(name);
		this.setStartjaar(startjaar);
		this.setStartmaand(startmaand);
		this.setStartdag(startdag);
		this.setStartuur(startuur);
		this.setStartminuten(startminuten);
		this.setEindjaar(eindjaar);
		this.setEindmaand(eindmaand);
		this.setEinddag(einddag);
		this.setEinduur(einduur);
		this.setEindminuten(eindminuten);
		this.setTitle(title);
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

	public String getStartjaar() {
		return startjaar;
	}

	public void setStartjaar(String startjaar) {
		this.startjaar = startjaar;
	}

	public String getStartmaand() {
		return startmaand;
	}

	public void setStartmaand(String startmaand) {
		this.startmaand = startmaand;
	}

	public String getStartdag() {
		return startdag;
	}

	public void setStartdag(String startdag) {
		this.startdag = startdag;
	}

	public String getStartuur() {
		return startuur;
	}

	public void setStartuur(String startuur) {
		this.startuur = startuur;
	}

	public String getStartminuten() {
		return startminuten;
	}

	public void setStartminuten(String startminuten) {
		this.startminuten = startminuten;
	}

	public String getEindjaar() {
		return eindjaar;
	}

	public void setEindjaar(String eindjaar) {
		this.eindjaar = eindjaar;
	}

	public String getEindmaand() {
		return eindmaand;
	}

	public void setEindmaand(String eindmaand) {
		this.eindmaand = eindmaand;
	}

	public String getEinddag() {
		return einddag;
	}

	public void setEinddag(String einddag) {
		this.einddag = einddag;
	}

	public String getEinduur() {
		return einduur;
	}

	public void setEinduur(String einduur) {
		this.einduur = einduur;
	}

	public String getEindminuten() {
		return eindminuten;
	}

	public void setEindminuten(String eindminuten) {
		this.eindminuten = eindminuten;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	

}
