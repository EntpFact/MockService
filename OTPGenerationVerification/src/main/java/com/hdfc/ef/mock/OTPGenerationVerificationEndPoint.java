package com.hdfc.ef.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.enstagesas.enstageotpservice.hdfc.GeneratePwdRequest;
import com.enstagesas.enstageotpservice.hdfc.GeneratePwdRequestResponse;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequest;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequestResponse;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequestReturn;

@Endpoint
public class OTPGenerationVerificationEndPoint {
	private static final String NAMESPACE_URI = "http://www.enstagesas.com/enStageOTPService/hdfc";
	private OTPGenerator OTPGenerator;

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "generatePwdRequest")
	@ResponsePayload	
		public	GeneratePwdRequestResponse getGeneratePwdRequestReturn(@RequestPayload GeneratePwdRequest request){
		return OTPGenerator.findOTP(request);		
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "verifyPwdRequest")
	@ResponsePayload	
		public	VerifyPwdRequestReturn verifyOTP(@RequestPayload VerifyPwdRequest request){
		return OTPVerifier.otpVerification(request)	;	
	}
	
	
	
}
