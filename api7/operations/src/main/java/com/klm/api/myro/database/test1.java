package com.klm.api.myro.database;

public class test1 {
    private String voornaam;
    private String achternaam;
    private String personeelsnummer;
    
    public test1() {}
    
    public test1(String voornaam, String achternaam, String personeelsnummer) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.personeelsnummer = personeelsnummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }
    
    
    
}
