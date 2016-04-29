/**
 * 
 */
package com.ait.transports.http.rest;


import com.ait.transports.logger.TLog;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;



/**
 * @author Sandeep Kotha
 *
 */
public enum RestService {
	INSTANCE;
	
	public void initRestSubscriber(String url) {
		
		Spark.post(new Route(url) {
			
			@Override
			public Object handle(Request request, Response response) {
				TLog.INSTANCE.print(request.body());
				response.status(202);
				return "";
			}
		});
		
		

	}
}
