/**
 * 
 */
package com.ait.transports.logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Sandeep Kotha
 *
 */
public enum TLog {

	INSTANCE;
	
	public void print(String message) 
	{
	
		try {
			System.err.println(message);
			Files.write(Paths.get("./mock-svc.log"), message.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
