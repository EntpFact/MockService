package com.hdfc.OTPGeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GenerateOneTimePassword;
import io.spring.guides.gs_producing_web_service.GenerateOneTimePasswordRequest;
import io.spring.guides.gs_producing_web_service.GeneratePwdRequestResponse;

@Endpoint
public class OTPGenerationEndPoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	private OTPGenerator OTPGenerator;

	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "generateOneTimePasswordRequest")
	@ResponsePayload	
		public	GeneratePwdRequestResponse getGeneratePwdRequestReturn(@RequestPayload GenerateOneTimePasswordRequest request){
		GeneratePwdRequestResponse response =new GeneratePwdRequestResponse();
		String req=request.toString();
		response.setGeneratePwdRequestReturn(OTPGenerator.findOTP());
		return response;
	}
	
	
	
}
