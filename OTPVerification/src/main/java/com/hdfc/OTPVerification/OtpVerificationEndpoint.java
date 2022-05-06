package com.hdfc.OTPVerification;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import hdfcbank.ws.otpverification.VerifyOneTimePasswordRequest;
import hdfcbank.ws.otpverification.VerifyOneTimePasswordResponse;
import hdfcbank.ws.otpverification.Return;
import hdfcbank.ws.otpverification.Status;


@Endpoint
public class OtpVerificationEndpoint {
	private static final String NAMESPACE_URI = "http://hdfcbank/ws/OTPVerification";
	private OtpVerifier OtpVerifier;	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "verifyOneTimePasswordRequest")
	@ResponsePayload	
		public	VerifyOneTimePasswordResponse getReturn(@RequestPayload VerifyOneTimePasswordRequest request){
		OtpVerifier verifier =new OtpVerifier();		
		return verifier.VerifierOTP(request);
	}
	
}
