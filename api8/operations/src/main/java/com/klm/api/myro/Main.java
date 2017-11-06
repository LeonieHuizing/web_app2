///GENERAL INFORMATION:
// V1 is deployed to the application server at KLM: 26-10-2017
// Current version is v2

package com.klm.api.myro;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.klm.api.myro.database.TestServices;


@SpringBootApplication
public class Main 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Main.class, args);
    	//TestServices.getEMailRecepientList();
    }
}