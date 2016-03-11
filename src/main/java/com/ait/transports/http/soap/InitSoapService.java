package com.ait.transports.http.soap;

import javax.xml.ws.Endpoint;

import com.umusic.itga.servicemarket.publishermanager.v1.PublishSubscribe;
import com.umusic.itga.servicemarket.publishermanager.v1.PublishSubscribeImpl;

public class InitSoapService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String serviceAddress = "http://localhost:9099/mysoap";  
		 PublishSubscribe implementor = new PublishSubscribeImpl();
	     Endpoint ep = Endpoint.publish(serviceAddress, implementor);

	}

}
