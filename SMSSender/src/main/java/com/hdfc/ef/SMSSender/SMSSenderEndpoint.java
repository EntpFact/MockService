package com.hdfc.ef.SMSSender;



import org.springframework.http.server.ServerHttpResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.addressing.server.annotation.Action;

import com.hdfcbank.smsservice.SMSRequest;
import com.hdfcbank.smsservice.SMSResponse;

@Endpoint
public class SMSSenderEndpoint {

	private static final String NAMESPACE_URI = "http://www.hdfcbank.com/SMSService/";
	@Action("http://localhost:8081/SMSService/SendSMS")
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SMSRequest")
	@ResponsePayload	
		public	SMSResponse SMSResponse(@RequestPayload SMSRequest request){
		SMSSender response =new SMSSender();		
		return response.sendSMS();
	}
	
}
