package com.klm.api.myro.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestServices {
	
	public static void getEMailRecepientList() {
        List<test1> emailList = null;// Blank list of POJO class
        Scanner scanner = null;
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("D:/Users/lhuizing/Documents/Projecten/KLM/database/Test3.csv"));
            Map<String, Integer> mailHeader = new HashMap<String, Integer>();
           
            // read file line by line
            String line = null;
            int index = 0;
            line = reader.readLine();
            
            // Get header from 1st row of csv
            if (line != null) {
                StringTokenizer str = new StringTokenizer(line, ",");
                int headerCount = str.countTokens();
                for (int i = 0; i < headerCount; i++) {
                    String headerKey = str.nextToken();
                    mailHeader.put(headerKey.toUpperCase(), new Integer(i));
                    
                }
            }
            
            emailList = new ArrayList<test1>();

            while ((line = reader.readLine()) != null) {
            // POJO class for getter and setters
                test1 email = new test1();
                scanner = new Scanner(line);
                scanner.useDelimiter(",");
            
                //Use Specific key to get value what u want
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == mailHeader.get("EMAIL"))
                        email.setEmailId(data);
                    else if (index == mailHeader.get("FN"))
                        email.setFirstName(data);
                    else if (index == mailHeader.get("LN"))
                        email.setLastName(data);
                    else if (index == mailHeader.get("CC"))
                        email.setCouponCode(data);

                    index++;
                }
                index = 0;
                emailList.add(email);
            }
            reader.close();
        } catch (Exception e) {
            StringWriter stack = new StringWriter();
            e.printStackTrace(new PrintWriter(stack));

        } finally {
            scanner.close();
        }

        
        System.out.println("list--" + emailList);

       
    }
}
