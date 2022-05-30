package com.hdfc.ef.mock;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.enstagesas.enstageotpservice.hdfc.GeneratePwdRequest;
import com.enstagesas.enstageotpservice.hdfc.GeneratePwdRequestResponse;
import com.enstagesas.enstageotpservice.hdfc.HDFCGenPwdRes;

@Component
public class OTPGenerator { 
	
	static Map<String, String> OTPGenResponse=new HashMap();
	public static GeneratePwdRequestResponse findOTP(GeneratePwdRequest request) {	
		GeneratePwdRequestResponse otpgenreturn=new GeneratePwdRequestResponse();		
		HDFCGenPwdRes response = new HDFCGenPwdRes();
		 Random rndm_method = new Random();      
    	 String OTP=Integer.toString(rndm_method.nextInt(999999));    	 	
    	 response.setDatetimeExpire("");response.setErrorDetail("");
    	 response.setFillerField1("");response.setFillerField2("");response.setFillerField3("");
    	 response.setFillerField4("");response.setFillerField5("");response.setMessageHash("");
    	 response.setPasswordValue("0");response.setRefNo(request.getHDFCGenPwdReq().getRefNo());response.setStatusCode("");    	 
    	
    	 if(OTPGenResponse.isEmpty() ) {
    		 response.setPasswordValue(OTP);
        	 response.setStatusCode("00");          	 
    	 }else if (OTPGenResponse.get("status").contentEquals("success")) {
    	 response.setPasswordValue(OTP);
    	 response.setStatusCode(OTPGenResponse.get("responseCode"));
		 response.setErrorDetail(OTPGenResponse.get("responseDesc"));
    	 }else if(OTPGenResponse.get("status").contentEquals("failure")){    		
    		 response.setStatusCode(OTPGenResponse.get("responseCode"));
    		 response.setErrorDetail(OTPGenResponse.get("responseDesc"));
    	 }else if(OTPGenResponse.get("status").contentEquals("exception")){
    		 throw new RuntimeException();
    	 }else if(OTPGenResponse.get("status").contentEquals("timeout")){
    		try {
				Thread.sleep(1800000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 } 
    	 otpgenreturn.setHDFCGenPwdRes(response);
    	 
		return otpgenreturn;
	}
	public void responseUpdate(Map<String,String> map) {
		OTPGenResponse=map;
	}
}
