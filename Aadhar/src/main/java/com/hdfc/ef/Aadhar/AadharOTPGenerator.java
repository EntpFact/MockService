package com.hdfc.ef.Aadhar;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequest;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateRequestType;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponse;
import com.hdfcbank.xsd.otp.uidaiekyc.EKYCOTPGenrateResponseType;
import com.hdfcbank.xsd.otp.uidaiekyc.ResTransactionInfoType;
import com.hdfcbank.xsd.otp.uidaiekyc.ReturnCodeType;


@Component
public class AadharOTPGenerator {
	
	public static EKYCOTPGenrateResponse generateOTP(EKYCOTPGenrateRequest request) {
		Map<String, String> mapResponse= ResponseStatusLoaderController.mapResponse;
		//Map<String, String> mapResponse=new HashMap();
		EKYCOTPGenrateResponse response =new EKYCOTPGenrateResponse();
		ReturnCodeType returnCodeType=new ReturnCodeType();
		ResTransactionInfoType resTransactionInfoType = new ResTransactionInfoType();
		//
		response.setErrorcode("00");
		// success case configuration Return Code
		 returnCodeType.setRet("Y");		
		 Random rndm_method = new Random();  
	     String OTP=Integer.toString(rndm_method.nextInt(999999));
	    
	     returnCodeType.setTxn(request.getReqNo());
	     Date date = new Date();
	     Timestamp timestamp = new Timestamp(date.getTime());
	     returnCodeType.setTs(timestamp.toString());
	     returnCodeType.setInfo("01{A,2019-07-12T10:44:57,2.5,df5bffab9001baf50e83059d18f359203299fda12e0adc5f7362b638cc77e156,f4b4b1c92b5114442c49cb4f20f6c62cb46cc9dbb1175c0b918d414046f561e6,f4b4b1c92b5114442c49cb4f20f6c62cb46cc9dbb1175c0b918d414046f561e6,*******8990,NA}");
	   
	     // success case configuration resTransactionInfoType
	     resTransactionInfoType.setId("12656");
	     resTransactionInfoType.setPan("6071520449244946029");
	     resTransactionInfoType.setProcCode("12656");
	     resTransactionInfoType.setStan("008622");
	     final SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
	//     Timestamp time = new Timestamp(System.currentTimeMillis());
	     resTransactionInfoType.setLocalTransTime(sdf.format(timestamp));
	     resTransactionInfoType.setLocalDate(date.toString());
	     resTransactionInfoType.setPosCode("");
	     resTransactionInfoType.setAcqId("200030");
	     resTransactionInfoType.setRRN("919310008622");
	     resTransactionInfoType.setCATid("public");
	     resTransactionInfoType.setCAID("HDF000000000001");
	     resTransactionInfoType.setCATA("HDFC BANK LTD KanjurmarMumbai       MHIN"); 
	     if(mapResponse.isEmpty() ) {
	    	 response.setErrorcode("00"); 
	    	 returnCodeType.setRet("Y");
	    	 returnCodeType.setCode(OTP);
    	 }else if (mapResponse.get("status").contentEquals("success")) {
    		 response.setErrorcode(mapResponse.get("responseCode"));
    		 returnCodeType.setRet("Y");	
    		 returnCodeType.setErr(mapResponse.get("responseCode"));
    		 returnCodeType.setCode(OTP);
    	 }else if(mapResponse.get("status").contentEquals("failure")){    		
    		 response.setErrorcode(mapResponse.get("responseCode"));
    		 returnCodeType.setRet("N");
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
	     response.setReturnCode(returnCodeType);
	     response.setTransactionInfo(resTransactionInfoType);
		return response;
	}
}
