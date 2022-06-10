package com.hdfc.ef.OTPGenerationVerification;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.hdfcbank.otpservice.GeneratePwdRequest;
import com.hdfcbank.otpservice.GeneratePwdRequestResponse;
import com.hdfcbank.otpvalidation.VerifyPwdRequest;
import com.hdfcbank.otpvalidation.VerifyPwdRequestReturn;

@Endpoint
public class OTPGeneratorEndpoint {

	private static final String NAMESPACE_URI = "http://www.hdfcbank.com/OTPService/";
	private static final String NAMESPACE_VAL = "http://www.hdfcbank.com/OTPValidation/";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "generatePwdRequest")
	@ResponsePayload	
		public	GeneratePwdRequestResponse generateOTP(@RequestPayload GeneratePwdRequest request){
		return OTPGenerator.findOTP(request);
	}
	
	@PayloadRoot(namespace = NAMESPACE_VAL, localPart = "verifyPwdRequest")
	@ResponsePayload	
		public	VerifyPwdRequestReturn generateOTP(@RequestPayload VerifyPwdRequest request){
			
		return OTPVerifier.otpVerification(request);
	}
	
}
