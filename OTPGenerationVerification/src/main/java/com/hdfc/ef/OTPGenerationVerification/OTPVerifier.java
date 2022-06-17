package com.hdfc.ef.OTPGenerationVerification;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hdfcbank.otpvalidation.HDFCVerifyPwdRes;
import com.hdfcbank.otpvalidation.VerifyPwdRequest;
import com.hdfcbank.otpvalidation.VerifyPwdRequestResponse;
import com.hdfcbank.otpvalidation.VerifyPwdRequestReturn;


@Component
public class OTPVerifier {
	
	 public static  VerifyPwdRequestResponse otpVerification(VerifyPwdRequest request) {
		 Map<String, String> mapResponse= ResponseLoaderController.mapResponse;
		 VerifyPwdRequestResponse reqResponse=new VerifyPwdRequestResponse();
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
	 reqResponse.setVerifyPwdRequestReturn(verifyResponse);
	return reqResponse;
	
}

}
