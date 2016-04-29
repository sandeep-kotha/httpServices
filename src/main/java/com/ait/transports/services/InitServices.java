/**
 * 
 */
package com.ait.transports.services;

import com.ait.transports.http.rest.RestService;
import com.ait.transports.http.soap.SoapService;

/**
 * @author Sandeep Kotha
 *
 */
public class InitServices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//SoapService.INSTANCE.initBizTalkPublisher("http://localhost:9090/biztalk");
		RestService.INSTANCE.initRestSubscriber("/subscriber");
	}

}
