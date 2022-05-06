package com.hdfc.SMSSender;

import org.springframework.http.server.ServerHttpResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import hdfcbank.ws.smssender.SMSRequest;
import hdfcbank.ws.smssender.SMSResponse;

@Endpoint
public class SMSSenderEndpoint {

	private static final String NAMESPACE_URI = "http://hdfcbank/ws/SMSSender";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SMSRequest")
	@ResponsePayload	
		public	SMSResponse SMSResponse(@RequestPayload SMSRequest request){
		SMSSender response =new SMSSender();		
		return response.sendSMS();
	}
}
