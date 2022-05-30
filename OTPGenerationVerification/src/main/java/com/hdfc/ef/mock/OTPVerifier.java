package com.hdfc.ef.mock;

import java.util.Collections;
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
	
	 public static Map<String, String> mapResponse= new HashMap<>(); 
	 public static  VerifyPwdRequestReturn otpVerification(VerifyPwdRequest request) {
	
	VerifyPwdRequestReturn verifyResponse=new VerifyPwdRequestReturn();	
	HDFCVerifyPwdRes response = new HDFCVerifyPwdRes();	 
	 if(mapResponse.isEmpty() ) {
		 response.setStatusCode("00");
		 response.setErrorDetail("Success");		
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if (mapResponse.get("status").contentEquals("success")) {
		 response.setStatusCode(mapResponse.get("responseCode"));
		 response.setErrorDetail(mapResponse.get("responseDesc"));   
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if(mapResponse.get("status").contentEquals("failure")){
		 response.setStatusCode(mapResponse.get("responseCode"));
		 response.setErrorDetail(mapResponse.get("responseDesc")); 
		 response.setRefNo(request.getHDFCVerifyPwdReq().getRefNo());
		 response.setMessageHash("static:verpwdres:04:l8ZOuSZY3eQ3Mcx2zfBH6cR7ICU=");
	 }else if(mapResponse.get("status").contentEquals("exception")){
		 throw new RuntimeException();
	 }else if(mapResponse.get("status").contentEquals("timeout")){
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
public void responseUpdate(Map<String,String> map) {
	mapResponse=map;
}
}
