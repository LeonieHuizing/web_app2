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
		//Path computer LH: "/home/ubuntu/api/web_app2/Test3.csv"
		String csvFile = "D:/Users/lhuizing/Documents/Projecten/KLM/database/Test3.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";


	        try {

	           br = new BufferedReader(new FileReader(csvFile));
	            
	           while ((line = br.readLine()) != null) {
	                
	        	   String[] csvDataArray = line.split(csvSplitBy);
	               int[] intArray = new int[csvDataArray.length];
	               
	      	      for (int i = 3; i < csvDataArray.length; i++) {
	      	         String numberAsString = csvDataArray[i];
	      	         intArray[i] = Integer.parseInt(numberAsString);
	      	       
	      	         rosters.put(csvDataArray[0], new Roster(intArray[0],csvDataArray[1],csvDataArray[2], intArray[3], intArray[4],intArray[5],intArray[6], intArray[7], intArray[8], intArray[9],intArray[10],intArray[11], intArray[12]));
	      	      }
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
