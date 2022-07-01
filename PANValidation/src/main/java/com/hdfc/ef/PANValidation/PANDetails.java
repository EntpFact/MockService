package com.hdfc.ef.PANValidation;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import hdfcbank.ws.panval.PANDETAILSTYPE;
import hdfcbank.ws.panval.PANValServiceRequest;
import hdfcbank.ws.panval.PANValServiceResponse;

import org.json.*;


@Component
public class PANDetails {

	public static PANValServiceResponse PANDetails(PANValServiceRequest request) {	
		 PANValServiceResponse response=new PANValServiceResponse();
		PANDETAILSTYPE PANDet1 =new PANDETAILSTYPE();		
		ArrayList<PANDETAILSTYPE> PAN =new ArrayList<PANDETAILSTYPE>();
		 //Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;	
		 Map<String, String> mapResponse=ResponseStatusLoaderController.PanDetailsResponse;
		 Date date = new Date();
	     Timestamp timestamp = new Timestamp(date.getTime());
		response.setResponseTime(timestamp.toString());
		 if(mapResponse.isEmpty() ) {
			//Setting default success response		
				response.setReturnCode(new BigInteger("1"));
				response.setReturnDescription("Success");
				int length =request.getPAN().size();				
				List<PANDETAILSTYPE> PanList=new ArrayList<PANDETAILSTYPE>();
				for (int i=0;i<length;i++) {
					PANDETAILSTYPE PANDetail =new PANDETAILSTYPE();
					PANDetail.setPANStatus("E");
					PANDetail.setPAN(request.getPAN().get(i));						
					PanList.add(PANDetail);					
				}				
				response.getPANDetails().addAll(PanList);				
		 }else if (mapResponse.get("status").contentEquals("success")) {
			    response.setReturnCode(new BigInteger(mapResponse.get("responseCode")));
				response.setReturnDescription(mapResponse.get("responseDesc"));
				int length =request.getPAN().size();				
				List<PANDETAILSTYPE> PanList=new ArrayList<PANDETAILSTYPE>();
				for (int i=0;i<length;i++) {
					PANDETAILSTYPE PANDetail =new PANDETAILSTYPE();
					PANDetail.setPANStatus("E");
					PANDetail.setPAN(request.getPAN().get(i));						
					PanList.add(PANDetail);					
				}				
				response.getPANDetails().addAll(PanList);
	    	 }else if(mapResponse.get("status").contentEquals("failure")){    		
	    		 	response.setReturnCode(new BigInteger(mapResponse.get("responseCode")));   		 	
					response.setReturnDescription(mapResponse.get("responseDesc"));	
					//response.setPanDetails(null);
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
