package com.hdfc.ef.Aadhar.service;

import java.util.Map;

import com.hdfc.ef.Aadhar.ResponseStatusLoaderController;
import com.hdfcbank.xsd.otpval.uidaiekyc.EKYCRequest;
import com.hdfcbank.xsd.otpval.uidaiekyc.EKYCResponse;
import com.hdfcbank.xsd.otpval.uidaiekyc.LanguageProofofAddressType;
import com.hdfcbank.xsd.otpval.uidaiekyc.ProofofAddressType;
import com.hdfcbank.xsd.otpval.uidaiekyc.ProofofIdentityType;
import com.hdfcbank.xsd.otpval.uidaiekyc.ResADVInfoType;
import com.hdfcbank.xsd.otpval.uidaiekyc.ResTransactionInfoType;
import com.hdfcbank.xsd.otpval.uidaiekyc.ReturnCodeType;
import com.hdfcbank.xsd.otpval.uidaiekyc.TransactionInfoType;
import com.hdfcbank.xsd.otpval.uidaiekyc.UidDataType;

public class AdharOTPValidator {
public static EKYCResponse validateOTP(EKYCRequest request) {
	Map<String, String> mapResponse= ResponseStatusLoaderController.OTPValResponse;
	EKYCResponse response =new EKYCResponse();
	ReturnCodeType responseReturnCode=new ReturnCodeType();
	responseReturnCode.setRet("Y");
	responseReturnCode.setCode("075219d62240431cb2f477f1c0d0da16");
	responseReturnCode.setTxn("UKC:718230");
	responseReturnCode.setTs("2020-04-24T13:10:32.976+05:30");
	responseReturnCode.setErr("");
	responseReturnCode.setInfo("");
	responseReturnCode.setKo("");
	UidDataType responseUIDData=new UidDataType();
	responseUIDData.setUIDNO(request.getUIDNO());
	responseUIDData.setUIDTOKEN("01000446rTcqnEX0mjoEGu+bINRyFsyR/PCJgEp+KDaRqsMspd5O2oGDBik3iEO05WBLqNoE");
	ProofofIdentityType responseProofIdentity=new ProofofIdentityType();
	responseProofIdentity.setName("John");
	responseProofIdentity.setPhone("9009876900");
	responseProofIdentity.setGender("M");
	responseProofIdentity.setEmail("John@gmail.com");
	responseProofIdentity.setDOB("12/03/1993");		
	responseUIDData.setProofofIdentity(responseProofIdentity);
	ProofofAddressType responseProofOfAddress=new ProofofAddressType();
	responseProofOfAddress.setCAREOF("CCCCC");
	responseProofOfAddress.setBUILDING("BBBBB");
	responseProofOfAddress.setVILLAGETOWNCITY("VVVVV");
	responseProofOfAddress.setLOCALITY("LLLLL");
	responseProofOfAddress.setSTREET("SSSSS");
	responseProofOfAddress.setDISTRICT("DDDDD");	
	responseProofOfAddress.setSTATE("Karnataka");
	responseProofOfAddress.setCOUNTRY("India");
	responseProofOfAddress.setPINCODE("560078");
	responseProofOfAddress.setLANDMARK("LLLLL");
	responseUIDData.setProofofAddress(responseProofOfAddress);
	LanguageProofofAddressType responseLanguageProofOfAdd=new LanguageProofofAddressType();
	responseLanguageProofOfAdd.setNameInLanguage("John");
	responseLanguageProofOfAdd.setLanguage("13");
	responseUIDData.setLanguageProofofAddress(responseLanguageProofOfAdd);	
	response.setUidData(responseUIDData);	
	response.setReturnDescription("");	
	ResTransactionInfoType responseResTxnInf=new ResTransactionInfoType();
	responseResTxnInf.setAcqId("200030");
	responseResTxnInf.setCAID("HDF000000000001");
	responseResTxnInf.setCATA("HDFC BANK LTD KanjurmarMumbai MHIN");
	responseResTxnInf.setCATid("register");
	responseResTxnInf.setId("130000");
	responseResTxnInf.setLocalDate("");
	responseResTxnInf.setLocalTransTime("");
	responseResTxnInf.setMcc("");
	responseResTxnInf.setPan("6071520xxxxxxxx5299");
	responseResTxnInf.setPosCode("");
	responseResTxnInf.setPosEntryMode("");
	responseResTxnInf.setProcCode("130000");
	responseResTxnInf.setReqType("o");
	responseResTxnInf.setResponsecode("00");
	responseResTxnInf.setResponseMsg("Approved");
	responseResTxnInf.setRRN("011501718230");
	responseResTxnInf.setStan("");
	responseResTxnInf.setTransmDate("");
	response.setTransactionInfo(responseResTxnInf);
	ResADVInfoType responseADVInfo=new ResADVInfoType();
	responseADVInfo.setErrorCode("00");
	responseADVInfo.setErrorString("");
	responseADVInfo.setReferenceKey("114780555980");
	responseADVInfo.setReserveField1("");
	responseADVInfo.setReserveField2("");
	responseADVInfo.setStatus("Success");
	response.setADVInfo(responseADVInfo);
	 if(mapResponse.isEmpty() ) {
		 responseReturnCode.setRet("Y");
		 responseADVInfo.setErrorCode("00");
	 }else if (mapResponse.get("status").contentEquals("success")) {
		 responseReturnCode.setRet("Y");
		 responseADVInfo.setErrorCode("00");
	 }else if(mapResponse.get("status").contentEquals("failure")){    		
		 responseReturnCode.setRet("N");
		 responseADVInfo.setErrorCode(mapResponse.get("responseCode"));	
		 responseResTxnInf.setResponsecode(mapResponse.get("responseCode"));
		 responseResTxnInf.setResponseMsg(mapResponse.get("responseDesc"));
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
	 response.setReturnCode(responseReturnCode);
	return response;
	
}
}
