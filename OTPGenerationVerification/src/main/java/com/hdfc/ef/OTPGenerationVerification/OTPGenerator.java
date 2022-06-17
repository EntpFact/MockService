package com.hdfc.ef.OTPGenerationVerification;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.hdfcbank.otpservice.GeneratePwdRequest;
import com.hdfcbank.otpservice.GeneratePwdRequestResponse;
import com.hdfcbank.otpservice.GeneratePwdRequestReturn;
import com.hdfcbank.otpservice.HDFCGenPwdRes;





public class OTPGenerator {	
	public static GeneratePwdRequestResponse findOTP(GeneratePwdRequest request) {	
		GeneratePwdRequestResponse otpgenreturn=new GeneratePwdRequestResponse();
		GeneratePwdRequestReturn returnResponse=new GeneratePwdRequestReturn();
		HDFCGenPwdRes response = new HDFCGenPwdRes();
		Map<String, String> OTPGenResponse=ResponseLoaderController.OTPGenResponse;
		 Random rndm_method = new Random();   		
    	 String OTP=Integer.toString(rndm_method.nextInt(999999));    	 	
    	 response.setDatetimeExpire("");response.setErrorDetail("");
    	 response.setFillerField1("");response.setFillerField2("");response.setFillerField3("");
    	 response.setFillerField4("");response.setFillerField5("");response.setMessageHash("");    	
    	 response.setPasswordValue("0");
    	 response.setRefNo(request.getHDFCGenPwdReq().getRefNo());response.setStatusCode("");   
    	 response.setMessageHash("static:genpwdres:07:4cDB8+7vJq0AZADwQ/FXh1eDolw=");
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm");
         Date date = new Date();
         
         Calendar c = Calendar.getInstance();
         c.setTime(date);      
         c.add(Calendar.MINUTE, 5);        
         Date expiryTime = c.getTime();       
       
    	 if(OTPGenResponse.isEmpty() ) {
    		 response.setPasswordValue(OTP);
        	 response.setStatusCode("00"); 
        	 response.setDatatimeGen(dateFormat.format(date));
             response.setDatetimeExpire(dateFormat.format(expiryTime));
    	 }else if (OTPGenResponse.get("status").contentEquals("success")) {
    	 response.setPasswordValue(OTP);
    	 response.setStatusCode(OTPGenResponse.get("responseCode"));
		 response.setErrorDetail(OTPGenResponse.get("responseDesc"));
		 response.setDatatimeGen(dateFormat.format(date));
         response.setDatetimeExpire(dateFormat.format(expiryTime));
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
    	 returnResponse.setHDFCGenPwdRes(response);    	   	
    	 otpgenreturn.setGeneratePwdRequestReturn(returnResponse);	
    //	 otpgenreturn.setHDFCGenPwdRes(response);
		return otpgenreturn;
	}
	
}
