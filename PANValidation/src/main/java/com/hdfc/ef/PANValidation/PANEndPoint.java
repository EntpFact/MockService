package com.hdfc.ef.PANValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import hdfcbank.ws.dedupecheck.DedupeServiceRequest;
import hdfcbank.ws.dedupecheck.DedupeServiceResponse;
import hdfcbank.ws.dedupecheck.EnquiryServiceRequest;
import hdfcbank.ws.dedupecheck.EnquiryServiceResponse;
import hdfcbank.ws.dedupecheck.GetStatusRequest;
import hdfcbank.ws.dedupecheck.GetStatusServiceResponse;
import hdfcbank.ws.panval.PANValServiceRequest;
import hdfcbank.ws.panval.PANValServiceRequestType;
import hdfcbank.ws.panval.PANValServiceResponse;
import hdfcbank.ws.panval.PANValServiceResponseType;
import com.hdfc.ef.service.DedupeCheckService;
import com.hdfc.ef.service.EnquireBureauService;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceRequest;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceResponse;

@Endpoint
public class PANEndPoint {
	private static final String NAMESPACE_URI = "http://hdfcbank/ws/PANVal";
	private static final String DEDUPE_NAMESPACE_URI = "http://hdfcbank/ws/DedupeCheck";
	private static final String ENQ_BUREAU_NAMESPACE_URI = "multibureau.xsd.hdfcbank.com";
	private PANDetails PANDetail;	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "PANValServiceRequest")
	@ResponsePayload	
		public	PANValServiceResponse getPANValResponse(@RequestPayload PANValServiceRequest request){	
		return PANDetail.PANDetails(request);
	}
	
	@PayloadRoot(namespace = DEDUPE_NAMESPACE_URI, localPart = "EnquiryServiceRequest")
	@ResponsePayload	
		public	EnquiryServiceResponse postCustomerRequest(@RequestPayload EnquiryServiceRequest request){
		return DedupeCheckService.customerRequest(request);	
	}
	@PayloadRoot(namespace = DEDUPE_NAMESPACE_URI, localPart = "getStatusRequest")
	@ResponsePayload	
		public	GetStatusServiceResponse getStatusRequest(@RequestPayload GetStatusRequest request){
		return DedupeCheckService.getStatus(request);	
	}
	@PayloadRoot(namespace = DEDUPE_NAMESPACE_URI, localPart = "DedupeServiceRequest")
	@ResponsePayload	
		public	DedupeServiceResponse getStatusRequest(@RequestPayload DedupeServiceRequest request){
		return DedupeCheckService.getCustomerMatch(request);	
	}
	@PayloadRoot(namespace = ENQ_BUREAU_NAMESPACE_URI, localPart = "MultiBureauServiceRequest")
	@ResponsePayload	
		public	MultiBureauServiceResponse getStatusRequest(@RequestPayload MultiBureauServiceRequest request){
		return EnquireBureauService.enquiryBureauResponse(request);	
	}
	
}
