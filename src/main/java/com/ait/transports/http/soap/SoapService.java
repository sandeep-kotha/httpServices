package com.ait.transports.http.soap;

import javax.xml.ws.Endpoint;

import com.umusic.itga.servicemarket.publishermanager.v1.PublishSubscribe;
import com.umusic.itga.servicemarket.publishermanager.v1.PublishSubscribeImpl;

public enum SoapService {

	INSTANCE;
	/**
	 * @param args
	 */
	public void initBizTalkPublisher(String url) {		 
		 PublishSubscribe implementor = new PublishSubscribeImpl();
	     Endpoint ep = Endpoint.publish(url, implementor);
	}

}
