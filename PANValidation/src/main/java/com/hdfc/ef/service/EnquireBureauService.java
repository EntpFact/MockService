package com.hdfc.ef.service;

import com.hdfcbank.xsd.multibureau.AckHeaderType;
import com.hdfcbank.xsd.multibureau.AcknowledgementType;
import com.hdfcbank.xsd.multibureau.CommunicationParamType;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceRequest;
import com.hdfcbank.xsd.multibureau.MultiBureauServiceResponse;

public class EnquireBureauService {
public  static MultiBureauServiceResponse enquiryBureauResponse(MultiBureauServiceRequest request) {
	MultiBureauServiceResponse response =new MultiBureauServiceResponse();
	CommunicationParamType responseCommParam=new CommunicationParamType();
	responseCommParam.setAGGREGATORID("545");
	responseCommParam.setINSTITUTIONID("4010");
	responseCommParam.setMEMBERID("sme_cpu@mbfs.com");
	responseCommParam.setPASSWORD("RSRiYTkkMk8=");
	AcknowledgementType responseAck=new AcknowledgementType();
	responseAck.setSTATUS("SUCCESS");
	responseAck.setACKNOWLEDGEMENTID("200");
	AckHeaderType responseAckHeader=new AckHeaderType();
	responseAckHeader.setAPPLICATIONID("APP100");
	responseAckHeader.setCUSTID("CUST.ID.001");
	responseAckHeader.setREQUESTRECEIVEDTIME("");
	responseAckHeader.setRESPONSETYPE("RS1001");
	responseAckHeader.setSOURCESYSTEM("");
	responseAck.setHEADER(responseAckHeader);
	response.setACKNOWLEDGEMENT(responseAck);
	response.setCommunicationParam(responseCommParam);
	return response;
}
}
