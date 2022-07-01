package com.hdfc.ef.CheckETBorNTB;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hdfc.ef.PANValidation.ResponseStatusLoaderController;
import com.hdfcbank.xsd.multibureau.WarningsType;

@RestController
public class CheckETBorNTBController {	
	@Value ("${checkETBorNTB.Response}")
	 public String ETBStaticResponse;	
	ObjectMapper mapper= new ObjectMapper();
	Map<String,String> resp=new HashMap<>();
	@PostMapping("/CheckETBorNTBRequest")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request) throws JsonMappingException, JsonProcessingException      
    {  
		 Map<String, String> mapResponse=ResponseStatusLoaderController.ETBCheckResponse;
		String MobileNo=((Map<String,String>) request.get("FetchCustomerCASADetailsReqDTO")).get("mobileNumber");
		String ETBResponse=ETBStaticResponse;
		ETBResponse=ETBResponse.replace("MOBILENUMBER", MobileNo);			
		if(mapResponse.isEmpty() ) {	
			ETBResponse=ETBResponse.replaceAll("ERRORCODE", "0");
			ETBResponse=ETBResponse.replaceAll("ERRORDESC", "Success");
		 }else if (mapResponse.get("status").contentEquals("success")) {	
			 ETBResponse=ETBResponse.replaceAll("ERRORCODE", "0");
				ETBResponse=ETBResponse.replaceAll("ERRORDESC", "Success");
	    	 }else if(mapResponse.get("status").contentEquals("failure")){ 
	    		 ETBResponse= ETBResponse.replaceAll("ERRORCODE", mapResponse.get("responseCode"));
	    		 ETBResponse= ETBResponse.replaceAll("ERRORDESC", mapResponse.get("responseDesc"));	    						
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
		resp=mapper.readValue(ETBResponse, Map.class);	
	    return new ResponseEntity<>(resp,HttpStatus.CREATED);
    }
}
