package com.umusic.itga.servicemarket.publishermanager.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

public class PublishSubscribeImpl implements PublishSubscribe {

	@Override
	@WebResult(name = "PublishResult", targetNamespace = "http://itga.umusic.com/servicemarket/publishermanager/v1")
	@Action(input = "http://itga.umusic.com/servicemarket/publishermanager/v1/Publisher/Publish", output = "http://itga.umusic.com/servicemarket/publishermanager/v1/PublishSubscribe/PublishResponse", fault = @FaultAction(className = PublishSubscribePublishPubSubFaultFaultFaultMessage.class, value = "http://itga.umusic.com/servicemarket/publishermanager/v1/PublishSubscribe/PublishPubSubFaultFault"))
	@RequestWrapper(localName = "Publish", targetNamespace = "http://itga.umusic.com/servicemarket/publishermanager/v1", className = "com.umusic.itga.servicemarket.publishermanager.v1.Publish")
	@WebMethod(operationName = "Publish", action = "http://itga.umusic.com/servicemarket/publishermanager/v1/Publisher/Publish")
	@ResponseWrapper(localName = "PublishResponse", targetNamespace = "http://itga.umusic.com/servicemarket/publishermanager/v1", className = "com.umusic.itga.servicemarket.publishermanager.v1.PublishResponse")
	public boolean publish(@WebParam(name = "x", targetNamespace = "http://itga.umusic.com/servicemarket/publishermanager/v1") Xmldoc x)
			throws PublishSubscribePublishPubSubFaultFaultFaultMessage {		
		return true;
	}

	

}
