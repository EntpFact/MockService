package com.hdfc.ef.service;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hdfc.ef.PANValidation.ResponseStatusLoaderController;

import hdfcbank.ws.dedupecheck.ClosedAccDetailType;
import hdfcbank.ws.dedupecheck.ClosedAccMatchType;
import hdfcbank.ws.dedupecheck.ClosedAccSummaryType;
import hdfcbank.ws.dedupecheck.DedupeResponseEnquiryInfoType;
import hdfcbank.ws.dedupecheck.DedupeResponseHeaderInfoType;
import hdfcbank.ws.dedupecheck.DedupeServiceRequest;
import hdfcbank.ws.dedupecheck.DedupeServiceResponse;
import hdfcbank.ws.dedupecheck.DetailType;
import hdfcbank.ws.dedupecheck.EnquiryServiceRequest;
import hdfcbank.ws.dedupecheck.EnquiryServiceResponse;
import hdfcbank.ws.dedupecheck.GetStatusRequest;
import hdfcbank.ws.dedupecheck.GetStatusServiceResponse;
import hdfcbank.ws.dedupecheck.HeaderInfoType;
import hdfcbank.ws.dedupecheck.MatchParameterType;
import hdfcbank.ws.dedupecheck.MatchValueType;
import hdfcbank.ws.dedupecheck.NegativeListType;
import hdfcbank.ws.dedupecheck.SoaFillers;
import hdfcbank.ws.dedupecheck.SummaryType;
import hdfcbank.ws.panval.PANDETAILSTYPE;

public class DedupeCheckService {
	
	
	public static EnquiryServiceResponse customerRequest(EnquiryServiceRequest request) {
		 Map<String, String> mapResponse=ResponseStatusLoaderController.DedupeCustomerRequest;
		EnquiryServiceResponse response=new EnquiryServiceResponse();
		HeaderInfoType headerRequest=request.getHeaderInfo();
		response.setSourceSystem(headerRequest.getSourceSystemName());
		response.setRequestNumber(headerRequest.getRequestNumber());
		response.setMatchProfile(headerRequest.getMatchProfile());		
		if(mapResponse.isEmpty() ) {
			response.setFactivaType("200");
			response.setClosedAccountType("200");
			response.setSOACommonResponse("200");
		 }else if (mapResponse.get("status").contentEquals("success")) {
			 response.setFactivaType("200");
				response.setClosedAccountType("200");
				response.setSOACommonResponse("200");
	    	 }else if(mapResponse.get("status").contentEquals("failure")){	    		 	
					response.setFactivaType(mapResponse.get("responseCode"));
					response.setClosedAccountType(mapResponse.get("responseCode"));
					response.setSOACommonResponse(mapResponse.get("responseCode"));					
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
	public static GetStatusServiceResponse getStatus(GetStatusRequest request) {
		Map<String, String> mapResponse=ResponseStatusLoaderController.DedupeGetStatus;
		GetStatusServiceResponse response=new GetStatusServiceResponse();		
		response.setSourceSystem(request.getSourceSystem());
		response.setRequestNumber(request.getRequestNumber());
		response.setMatchProfile(request.getMatchProfile());
		response.setType(request.getType());
		response.setFactivaType("200");
		response.setClosedAccountType("200");
		response.setSOACommonResponse("200");
		
		if(mapResponse.isEmpty() ) {
			response.setFactivaType("200");
			response.setClosedAccountType("200");
			response.setSOACommonResponse("200");
		 }else if (mapResponse.get("status").contentEquals("success")) {
			 response.setFactivaType("200");
				response.setClosedAccountType("200");
				response.setSOACommonResponse("200");
	    	 }else if(mapResponse.get("status").contentEquals("failure")){	    		 	
					response.setFactivaType(mapResponse.get("responseCode"));
					response.setClosedAccountType(mapResponse.get("responseCode"));
					response.setSOACommonResponse(mapResponse.get("responseCode"));					
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
	public static DedupeServiceResponse getCustomerMatch(DedupeServiceRequest request) {
		Map<String, String> mapResponse=ResponseStatusLoaderController.DedupeResponse;
		DedupeServiceResponse response=new DedupeServiceResponse();
		DedupeResponseHeaderInfoType headerResponse=new DedupeResponseHeaderInfoType();
		DedupeResponseEnquiryInfoType responseEnquiry=new DedupeResponseEnquiryInfoType();
		SummaryType responseSummary=new SummaryType();
		DetailType responseDetails=new DetailType();
		NegativeListType responseNegativeListType=new NegativeListType();
		ClosedAccSummaryType responseClosedAccSummary=new ClosedAccSummaryType();
		ClosedAccMatchType responseClosedAccMatch=new ClosedAccMatchType();
		ClosedAccDetailType responseClosedAccDetails=new ClosedAccDetailType();
		SoaFillers responseFillers=new SoaFillers();
		MatchValueType responseMatchValue=new MatchValueType();
		MatchParameterType responseMatchParameter=new MatchParameterType();
		headerResponse.setSourceSystemName(request.getHeaderInfo().getSourceSystemName());
		headerResponse.setRequestNumber(request.getHeaderInfo().getRequestNumber());
		headerResponse.setAODNumber(request.getHeaderInfo().getAODNumber());
		headerResponse.setCustomerCategory(request.getHeaderInfo().getCustomerCategory());
		headerResponse.setRequestorUserID(request.getHeaderInfo().getRequestorUserID());
		headerResponse.setEnquiryDateTime(request.getHeaderInfo().getEnquiryDateTime());
		headerResponse.setEnquiryBranch(request.getHeaderInfo().getEnquiryBranch());
		headerResponse.setMatchProfile(request.getHeaderInfo().getMatchProfile());
		headerResponse.setIPAddress(request.getHeaderInfo().getIPAddress());
		headerResponse.setMACAddress(request.getHeaderInfo().getMACAddress());
		
		responseEnquiry.setCustomerName(request.getEnquiryInfo().getCustomerName());
		responseEnquiry.setDateOfBirth(request.getEnquiryInfo().getDateOfBirth());
		responseEnquiry.setEmailId(request.getEnquiryInfo().getEmailId());
		responseEnquiry.setLandPhone(request.getEnquiryInfo().getLandPhone());
		responseEnquiry.setMobileNo(request.getEnquiryInfo().getMobileNo());
		responseEnquiry.setPanNo(request.getEnquiryInfo().getPanNo());
		responseEnquiry.setUID(request.getEnquiryInfo().getUID());
			
		responseSummary.setFactiva(responseMatchValue);
		responseSummary.setMatchCombination("200");
		responseSummary.setNegativeList(responseMatchValue);
		responseSummary.setNeglistMatch("");
				
		if(mapResponse.isEmpty() ) {
			headerResponse.setSOACommonResponse("201");
			headerResponse.setFactivaResponseCode("201");
			headerResponse.setClosedAccountResponseCode("201");
			responseSummary.setFactivaMatch("200");	
		 }else if (mapResponse.get("status").contentEquals("success")) {
			 headerResponse.setSOACommonResponse("201");
				headerResponse.setFactivaResponseCode("201");
				headerResponse.setClosedAccountResponseCode("201");
				responseSummary.setFactivaMatch("200");	
	    	 }else if(mapResponse.get("status").contentEquals("failure")){	   		 	
	    		 	responseSummary.setFactivaMatch(mapResponse.get("responseCode"));	
					headerResponse.setSOACommonResponse(mapResponse.get("responseCode"));
					headerResponse.setFactivaResponseCode(mapResponse.get("responseCode"));
					headerResponse.setClosedAccountResponseCode(mapResponse.get("responseCode"));
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
		response.setSoaFillers(responseFillers);
		response.setHeaderInfo(headerResponse);
		response.setEnquiryInfo(responseEnquiry);
		response.setSummary(responseSummary);
		return response;
		
	}
	
}
