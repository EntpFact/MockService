package com.hdfc.ef.Aadhar.service;

import java.util.Map;

import com.hdfc.ef.Aadhar.ResponseStatusLoaderController;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentage;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentageRequest;
import com.hdfcbank.xsd.addmatch.uidaiekyc.DoAddressMatchPercentageResponse;
import com.hdfcbank.xsd.addmatch.uidaiekyc.ReturnType;
import com.hdfcbank.xsd.addmatch.uidaiekyc.StatusType;

public class NameMatchCheck {
public static DoAddressMatchPercentageResponse NameMatchValidator(DoAddressMatchPercentageRequest request) {
	Map<String, String> mapResponse= ResponseStatusLoaderController.AdharNameMatch;
	DoAddressMatchPercentageResponse response=new DoAddressMatchPercentageResponse();
	ReturnType responseReturnType=new ReturnType();
	StatusType responseStatus=new StatusType();
	responseStatus.setErrorCode("0");
	responseStatus.setExtendedReply("");
	responseStatus.setExternalReferenceNo("020720180020");
	responseStatus.setReplyCode("0");
	responseStatus.setReplyText("0");
	responseStatus.setUserReferenceNumber("2018207017980003");		
	 if(mapResponse.isEmpty() ) {
		 responseStatus.setErrorCode("0");
		 responseStatus.setExtendedReply("");
		 responseStatus.setReplyCode("0");
		 responseStatus.setReplyText("0");
		 response.setAddressPercentage("75");
		 response.setEqualityPercentage("100");
		 response.setPerStatus("Y");
		 response.setNamePercentage("76");
		 response.setPhonePercentage("91");
		 response.setRemarks("Completed");	 
	 }else if (mapResponse.get("status").contentEquals("success")) {
		 responseStatus.setErrorCode("0");
		 responseStatus.setExtendedReply("");
		 responseStatus.setReplyCode("0");
	     responseStatus.setReplyText("0");
	     response.setAddressPercentage("75");
	 	 response.setEqualityPercentage("100");
	 	 response.setPerStatus("Y");
	 	 response.setNamePercentage("76");
	 	 response.setPhonePercentage("91");
	 	 response.setRemarks("Completed");
	 }else if(mapResponse.get("status").contentEquals("failure")){    		
		 responseStatus.setErrorCode(mapResponse.get("responseCode"));
		 responseStatus.setExtendedReply("");
		 responseStatus.setReplyCode(mapResponse.get("responseCode"));
		 responseStatus.setReplyText(mapResponse.get("responseDesc"));
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
	 responseReturnType.setStatus(responseStatus);
	 response.setReturn(responseReturnType);
	return response;
	
}
}
