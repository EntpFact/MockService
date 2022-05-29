package com.hdfc.ef.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequest;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequestType;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponse;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponseType;



@Endpoint
public class AadharOTPGenEndPoint {
	private static final String NAMESPACE_URI = "http://uidaiekyc.otp.xsd.hdfcbank.com";
	//private OTPGenerator OTPGenerator;

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "eKYCOTPGenrateRequest")
	@ResponsePayload	
		public	EKYCOTPGenrateResponse getGeneratePwdRequestReturn(@RequestPayload EKYCOTPGenrateRequest request){
		
		return AadharOTPGenerator.generateOTP(request);
	}
	
	
	
}
