package com.hdfc.ef.SMSSender;

import java.util.Map;
import com.hdfcbank.smsservice.SMSResponse;


public class SMSSender {
	
	static SMSResponse response=new SMSResponse();
	
 public static SMSResponse sendSMS() {
	 Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;
		
	 response.setFiller1(""); response.setFiller2("");response.setFiller3("");
	 response.setFiller4("");response.setFiller5("");
	 
	 response.setResponsecode("0");
	 
	 if(mapResponse.isEmpty() ) {		
		 response.setResponsecode("0");  
    	 response.setMessage("Success");    	 
	 }else if (mapResponse.get("status").contentEquals("success")) {
		 response.setResponsecode(mapResponse.get("responseCode"));  
    	 response.setMessage(mapResponse.get("responseDesc"));
	 }else if (mapResponse.get("status").contentEquals("failure")) {
		 response.setResponsecode(mapResponse.get("responseCode"));  
    	 response.setMessage(mapResponse.get("responseDesc")); 
	 }else if (mapResponse.get("status").contentEquals("exception")) {
		 throw new RuntimeException();
	 }else if (mapResponse.get("status").contentEquals("timeout")) {
		 try {
				Thread.sleep(1800000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }else {
		 response.setResponsecode("-1");  
    	 response.setMessage("Error");  
	 }
	return response;
	 
 }
}
