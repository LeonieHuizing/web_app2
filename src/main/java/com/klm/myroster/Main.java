/**
 * Version 1.0
 * 
 * MyRosterAPI gets data from a .csv file. The data is shown in a ionic App
 * The .csv file is generated from the MPS system. 
 * This files contains all the rosterdata of the KLM eployees of ground services.
 * 
 */

package com.klm.myroster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Main 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Main.class, args);
    	
    }
}
