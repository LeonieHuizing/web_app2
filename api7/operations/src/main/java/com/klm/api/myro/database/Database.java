package com.klm.api.myro.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.klm.api.myro.model.Roster;

public class Database {
	
	//This maps the id to the roster
	private static Map<String, Roster> rosters = new HashMap<>();
	
	public static Map<String, Roster> getRosters(){
		return rosters;
	}
	
	public static Map<String, Roster> getSpecificRoster(){
		return rosters;
	}
	
	
	public static void storeData(){
		//Variables to read the CSV file
		//Path computer LH: "D:/Users/lhuizing/Documents/Projecten/KLM/database/Test3.csv"
		String csvFile = "/home/ubuntu/api/web_app2/Test3.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";


	        try {

	           br = new BufferedReader(new FileReader(csvFile));
	            
	           while ((line = br.readLine()) != null) {
	                
	        	   String[] csvData = line.split(csvSplitBy);
	               rosters.put(csvData[0], new Roster(csvData[0],csvData[1],csvData[2], csvData[3], csvData[4],csvData[5],csvData[6], csvData[7], csvData[8], csvData[9],csvData[10],csvData[11], csvData[12]));
	                 
	            }

	       } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

	}
