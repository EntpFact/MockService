package com.hdfc.ef.Aadhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hdfc.ef.Aadhar.service.AadharOTPGenerator;
import com.hdfc.ef.Aadhar.service.AdharOTPValidator;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentage;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentageRequest;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentageResponse;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequest;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequestType;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponse;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponseType;
import com.hdfcbank.xsd.otpval.uidaiekyc.EKYCRequest;
import com.hdfcbank.xsd.otpval.uidaiekyc.EKYCResponse;
import com.hdfc.ef.Aadhar.service.AdharOTPValidator;
import com.hdfc.ef.Aadhar.service.NameMatchCheck;


@Endpoint
public class AadharEndPoint {
	private static final String NAMESPACE_URI = "http://uidaiekyc.otp.xsd.hdfcbank.com";
	private static final String OTP_VAL_NAMESPACE_URI = "http://uidaiekyc.otpval.xsd.hdfcbank.com";
	private static final String NAME_MATCH_NAMESPACE_URI="http://uidaiekyc.addMatch.xsd.hdfcbank.com";
		
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "eKYCOTPGenrateRequest")
	@ResponsePayload	
		public	EKYCOTPGenrateResponse getGeneratePwdRequestReturn(@RequestPayload EKYCOTPGenrateRequest request){
		
		return AadharOTPGenerator.generateOTP(request);
	}
	@PayloadRoot(namespace = OTP_VAL_NAMESPACE_URI, localPart = "eKYCRequest")
	@ResponsePayload	
		public	EKYCResponse validateOTP(@RequestPayload EKYCRequest request){		
		return AdharOTPValidator.validateOTP(request);
	}
	@PayloadRoot(namespace = NAME_MATCH_NAMESPACE_URI, localPart = "doAddressMatchPercentageRequest")
	@ResponsePayload	
		public	DoAddressMatchPercentageResponse NameMatchResponse(@RequestPayload DoAddressMatchPercentageRequest request){		
		return NameMatchCheck.NameMatchValidator(request);
	}
}
