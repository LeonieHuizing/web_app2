package com.klm.myroster.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.klm.myroster.model.Roster;


public class CsvRepository {
	//This maps the id to the roster
		private static Map<Long, Roster> rosters = new HashMap<>();
		
		public static Map<Long, Roster> getSpecificRoster(){
			return rosters;
		}

		
		public static void storeData(){
			//Variables to read the CSV file
			//Path computer AWS:  /home/ubuntu/api/web_app2/Test4.csv
			//Path computer LH: D:/Users/lhuizing/Documents/Projecten/KLM/database/Test4.csv
			//Path docker: /home/Test4.csv
			String csvFile = "/home/Test4.csv";
			BufferedReader br = null;
			String line = "";
			String csvSplitBy = ",";

		        try {
		           br = new BufferedReader(new FileReader(csvFile));
		           
		           long i=0;
		           while ((line = br.readLine()) != null) {
		        	   String[] csvDataArray = line.split(csvSplitBy);
		      	       rosters.put(i, new Roster(csvDataArray[0],csvDataArray[1],csvDataArray[2],csvDataArray[3],csvDataArray[4]));
		      	       i++;
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
