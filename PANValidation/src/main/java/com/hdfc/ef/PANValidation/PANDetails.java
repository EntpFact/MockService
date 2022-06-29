package com.hdfc.ef.PANValidation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import hdfcbank.ws.panval.PANDETAILSTYPE;
import hdfcbank.ws.panval.PANValServiceRequest;
import hdfcbank.ws.panval.PANValServiceRequestType;
import hdfcbank.ws.panval.PANValServiceResponse;
import hdfcbank.ws.panval.PANValServiceResponseType;

import org.json.*;


@Component
public class PANDetails {

	static PANValServiceResponseType rep=new PANValServiceResponseType();	
	
	public static PANValServiceResponse PANDetails(PANValServiceRequest request) {	
		 PANValServiceResponse response=new PANValServiceResponse();
		PANDETAILSTYPE PANDet1 =new PANDETAILSTYPE();		
		ArrayList PAN =new ArrayList();
		 //Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;	
		 Map<String, String> mapResponse= new HashMap<String, String>();	
		 Date date = new Date();
	     Timestamp timestamp = new Timestamp(date.getTime());
		response.setResponseTime(timestamp.toString());
		 if(mapResponse.isEmpty() ) {
			//Setting default success response		
				response.setReturnCode(1);
				response.setReturnDescription("Success");
				int length =request.getPAN().size();				
				for (int i=0;i<length;i++) {
					PANDETAILSTYPE PANDetail =new PANDETAILSTYPE();
					PANDetail.setPANStatus("E");
					PAN.add(PANDetail);
				}							
				response.setPANDetails(PAN);
		 }else if (mapResponse.get("status").contentEquals("success")) {
			    response.setReturnCode(Integer.parseInt(mapResponse.get("responseCode")));
				response.setReturnDescription(mapResponse.get("responseDesc"));
			/*	JSONArray arr = new JSONArray(mapResponse.get("PANDetails"));			
				for(int i = 0; i < arr.length(); i++){				  
				    PANDet.setFirstName(arr.getJSONObject(i).getString("firstname"));
				    PANDet.setLastName(arr.getJSONObject(i).getString("lastName"));
				    PANDet.setMiddleName(arr.getJSONObject(i).getString("middleName"));
				    PANDet.setPANTitle(arr.getJSONObject(i).getString("PANTitle"));
				    PANDet.setLastUpdateDate(arr.getJSONObject(i).getString("lastUpdateDate"));
				    PANDet.setPANStatus(arr.getJSONObject(i).getString("PANStatus"));
				    PAN.add(PANDet);
				}*/					
				int length =request.getPAN().size();
				for (int i=0;i<=length;i++) {
					PANDETAILSTYPE PANDetail =new PANDETAILSTYPE();
					PANDetail.setPANStatus("E");
					PAN.add(PANDetail);
				}							
				response.setPANDetails(PAN);
	    	 }else if(mapResponse.get("status").contentEquals("failure")){    		
	    		 	response.setReturnCode(Integer.parseInt(mapResponse.get("responseCode")));	    		 	
					response.setReturnDescription(mapResponse.get("responseDesc"));	
					response.setPANDetails(null);
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
		return response;	
	
	}
	
	
	
}
