package com.hdfc.OTPVerification;

import java.util.Map;

import javax.xml.ws.Response;

import com.hdfc.OTPVerification.ResponseStatusLoaderController;

import hdfcbank.ws.otpverification.Status;
import hdfcbank.ws.otpverification.VerifyOneTimePasswordRequest;
import hdfcbank.ws.otpverification.VerifyOneTimePasswordResponse;
import hdfcbank.ws.otpverification.Return;

public class OtpVerifier {
	static VerifyOneTimePasswordResponse repsonse=new VerifyOneTimePasswordResponse();
	static Status statusRepsonse=new Status();	
	static Return returnResponse=new Return();
	
	public static VerifyOneTimePasswordResponse VerifierOTP (VerifyOneTimePasswordRequest request) {
		 Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;
		 //Setting status object
		 statusRepsonse.setReplyCode(0);
		 statusRepsonse.setReplyText("Success");
		 statusRepsonse.setErrorCode("");statusRepsonse.setExtendedReply("");
		 statusRepsonse.setExternalReferenceNo("");statusRepsonse.setInternalReferenceNumber("");
		 statusRepsonse.setIsOverriden("");
		 statusRepsonse.setUserReferenceNumber("");
		 //Setting return object		
		 returnResponse.setFillerField1("");
		 returnResponse.setFillerField2("");
		 returnResponse.setFillerField3("");
		 returnResponse.setFillerField4("");
		 returnResponse.setFillerField5("");
		 if(mapResponse.isEmpty() ) {
			 statusRepsonse.setReplyCode(0);
			 statusRepsonse.setReplyText("Success");
    	 }else if (mapResponse.get("status").contentEquals("success")) {
    		 statusRepsonse.setReplyCode(0);
    		 statusRepsonse.setReplyText(mapResponse.get("responseDesc"));    			
    	 }else if(mapResponse.get("status").contentEquals("failure")){
    		 statusRepsonse.setReplyCode(1);  
    		 statusRepsonse.setErrorCode(mapResponse.get("responseCode"));
    		 statusRepsonse.setReplyCode(Integer.parseInt(mapResponse.get("responseCode")));
    		 statusRepsonse.setReplyText(mapResponse.get("responseDesc"));    		
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
    	 else {
    		 statusRepsonse.setReplyCode(1);  
    		 statusRepsonse.setErrorCode("");    	
    		 statusRepsonse.setReplyText("Issue while processing");     		 
    	 }
		 //Setting Return object
		 returnResponse.setStatus(statusRepsonse);
		 repsonse.setReturn(returnResponse);
		 return repsonse;
	}
}
