package com.hdfc.OTPGeneration;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.GeneratePwdRequestReturn;



@Component
public class OTPGenerator {
	static GeneratePwdRequestReturn repsonse=new GeneratePwdRequestReturn();	
	@PostConstruct
	public void initData() {		
		 Random rndm_method = new Random();    	
	}
	public static GeneratePwdRequestReturn findOTP() {	
		 Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;
			
		 Random rndm_method = new Random();    	
    	 int OTP=rndm_method.nextInt(999999); 
    	 repsonse.setDatatimeGen(0);repsonse.setDatetimeExpire(0);repsonse.setErrorDetail("");
    	 repsonse.setFillerField1("");repsonse.setFillerField2("");repsonse.setFillerField3("");
    	 repsonse.setFillerField4("");repsonse.setFillerField5("");repsonse.setMessageHash("");
    	 repsonse.setPasswordValue(0);repsonse.setRefNo("");repsonse.setStatusCode("");    	 
    	 
    	 if(mapResponse.isEmpty() ) {
    		 repsonse.setPasswordValue(OTP);
        	 repsonse.setStatusCode("0");          	 
    	 }else if (mapResponse.get("status").contentEquals("success")) {
    	 repsonse.setPasswordValue(OTP);
    	 repsonse.setStatusCode(mapResponse.get("responseCode"));
		 repsonse.setErrorDetail(mapResponse.get("responseDesc"));
    	 }else if(mapResponse.get("status").contentEquals("failure")){    		
    		 repsonse.setStatusCode(mapResponse.get("responseCode"));
    		 repsonse.setErrorDetail(mapResponse.get("responseDesc"));
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
    		 repsonse.setStatusCode("1");
    		 repsonse.setErrorDetail("Issue while processing");
    	 }    	 
		return repsonse;
	}
}
