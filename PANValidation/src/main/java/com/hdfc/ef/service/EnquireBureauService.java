package com.hdfc.ef.service;

import java.util.Map;

import com.hdfc.ef.PANValidation.ResponseStatusLoaderController;
import com.hdfcbank.xsd.multibureau.AckHeaderType;
import com.hdfcbank.xsd.multibureau.AcknowledgementType;
import com.hdfcbank.xsd.multibureau.CommunicationParamType;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceRequest;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceResponse;
import com.hdfcbank.xsd.multibureau.WarningsType;

public class EnquireBureauService {
public  static MultiBureauServiceResponse enquiryBureauResponse(MultiBureauServiceRequest request) {
	Map<String, String> mapResponse=ResponseStatusLoaderController.EnquireBureauResponse;
	MultiBureauServiceResponse response =new MultiBureauServiceResponse();
	CommunicationParamType responseCommParam=new CommunicationParamType();
	responseCommParam.setAGGREGATORID("545");
	responseCommParam.setINSTITUTIONID("4010");
	responseCommParam.setMEMBERID("sme_cpu@mbfs.com");
	responseCommParam.setPASSWORD("RSRiYTkkMk8=");
	AcknowledgementType responseAck=new AcknowledgementType();	
	responseAck.setACKNOWLEDGEMENTID("200");	
	AckHeaderType responseAckHeader=new AckHeaderType();
	responseAckHeader.setAPPLICATIONID("APP100");
	responseAckHeader.setCUSTID("CUST.ID.001");
	responseAckHeader.setREQUESTRECEIVEDTIME("");
	responseAckHeader.setRESPONSETYPE("RS1001");
	responseAckHeader.setSOURCESYSTEM("");
	
	if(mapResponse.isEmpty() ) {
		responseAck.setSTATUS("SUCCESS");
	 }else if (mapResponse.get("status").contentEquals("success")) {
		 responseAck.setSTATUS("SUCCESS");
    	 }else if(mapResponse.get("status").contentEquals("failure")){ 
				WarningsType responseWarningType=new WarningsType();
				responseWarningType.setCODE(mapResponse.get("responseCode"));
				responseWarningType.setDESCRIPTION(mapResponse.get("responseDesc"));
				responseAck.getWARNINGS().add(responseWarningType);
				responseAck.setSTATUS("FAILURE");
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
	responseAck.setHEADER(responseAckHeader);
	response.setACKNOWLEDGEMENT(responseAck);
	response.setCommunicationParam(responseCommParam);
	return response;
}
}
