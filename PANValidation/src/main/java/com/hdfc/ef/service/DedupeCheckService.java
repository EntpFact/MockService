package com.hdfc.ef.service;


import java.util.ArrayList;
import java.util.List;

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

public class DedupeCheckService {
	
	
	public static EnquiryServiceResponse customerRequest(EnquiryServiceRequest request) {
		EnquiryServiceResponse response=new EnquiryServiceResponse();
		HeaderInfoType headerRequest=request.getHeaderInfo();
		response.setSourceSystem(headerRequest.getSourceSystemName());
		response.setRequestNumber(headerRequest.getRequestNumber());
		response.setMatchProfile(headerRequest.getMatchProfile());
		response.setFactivaType("200");
		response.setClosedAccountType("200");
		response.setSOACommonResponse("200");
		return response;		
	}
	public static GetStatusServiceResponse getStatus(GetStatusRequest request) {
		GetStatusServiceResponse response=new GetStatusServiceResponse();		
		response.setSourceSystem(request.getSourceSystem());
		response.setRequestNumber(request.getRequestNumber());
		response.setMatchProfile(request.getMatchProfile());
		response.setType(request.getType());
		response.setFactivaType("200");
		response.setClosedAccountType("200");
		response.setSOACommonResponse("200");
		return response;		
	}
	public static DedupeServiceResponse getCustomerMatch(DedupeServiceRequest request) {
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
		headerResponse.setSOACommonResponse("201");
		headerResponse.setFactivaResponseCode("201");
		headerResponse.setClosedAccountResponseCode("201");
		responseEnquiry.setCustomerName(request.getEnquiryInfo().getCustomerName());
		responseEnquiry.setDateOfBirth(request.getEnquiryInfo().getDateOfBirth());
		responseEnquiry.setEmailId(request.getEnquiryInfo().getEmailId());
		responseEnquiry.setLandPhone(request.getEnquiryInfo().getLandPhone());
		responseEnquiry.setMobileNo(request.getEnquiryInfo().getMobileNo());
		responseEnquiry.setPanNo(request.getEnquiryInfo().getPanNo());
		responseEnquiry.setUID(request.getEnquiryInfo().getUID());
		responseSummary.setFactivaMatch("200");		
		responseSummary.setFactiva(responseMatchValue);
		responseSummary.setMatchCombination("200");
		responseSummary.setNegativeList(responseMatchValue);
		responseSummary.setNeglistMatch("");
		response.setSoaFillers(responseFillers);
		response.setHeaderInfo(headerResponse);
		response.setEnquiryInfo(responseEnquiry);
		response.setSummary(responseSummary);		
		return response;
		
	}
	
}
