package com.hdfc.ef.mock;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enstagesas.enstageotpservice.hdfc.HDFCVerifyPwdRes;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequest;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequestResponse;
import com.enstagesas.enstageotpservice.hdfc.VerifyPwdRequestReturn;

@Component
public class OTPVerifier {
	@Autowired
	ResponseLoaderController responseLoaderController;
	 
public static  VerifyPwdRequestReturn otpVerification(VerifyPwdRequest request) {
	Map<String, String> mapVerificationResponse=new HashMap();
//	mapVerificationResponse=responseLoaderController.mapResponse;	
	VerifyPwdRequestReturn verifyResponse=new VerifyPwdRequestReturn();	
	HDFCVerifyPwdRes response = new HDFCVerifyPwdRes();	 
	 if(mapVerificationResponse.isEmpty() ) {
		 response.setStatusCode("00");
		 response.setErrorDetail("Success");		
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if (mapVerificationResponse.get("status").contentEquals("success")) {
		 response.setStatusCode(mapVerificationResponse.get("responseCode"));
		 response.setErrorDetail(mapVerificationResponse.get("responseDesc"));   
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if(mapVerificationResponse.get("status").contentEquals("failure")){
		 response.setStatusCode(mapVerificationResponse.get("responseCode"));
		 response.setErrorDetail(mapVerificationResponse.get("responseDesc")); 
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if(mapVerificationResponse.get("status").contentEquals("exception")){
		 throw new RuntimeException();
	 }else if(mapVerificationResponse.get("status").contentEquals("timeout")){
		try {
			Thread.sleep(1800000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 verifyResponse.setHDFCVerifyPwdRes(response);
	return verifyResponse;
	
}
}
