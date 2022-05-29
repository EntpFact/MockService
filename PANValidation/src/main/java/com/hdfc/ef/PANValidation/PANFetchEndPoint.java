package com.hdfc.ef.PANValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import hdfcbank.ws.panval.PANValServiceRequest;
import hdfcbank.ws.panval.PANValServiceRequestType;
import hdfcbank.ws.panval.PANValServiceResponse;
import hdfcbank.ws.panval.PANValServiceResponseType;

@Endpoint
public class PANFetchEndPoint {
	private static final String NAMESPACE_URI = "http://hdfcbank/ws/PANVal";
	private PANDetails PANDetail;

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PANValServiceRequest")
	@ResponsePayload	
		public	PANValServiceResponse getPANValResponse(@RequestPayload PANValServiceRequest request){	
		return PANDetail.PANDetails(request);
	}
	
	
	
}
