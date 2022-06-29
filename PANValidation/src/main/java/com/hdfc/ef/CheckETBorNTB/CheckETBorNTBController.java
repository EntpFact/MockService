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

@RestController
public class CheckETBorNTBController {	
	@Value ("${checkETBorNTB.Response}")
	 public String ETBResponse;
	
	ObjectMapper mapper= new ObjectMapper();
	Map<String,String> resp=new HashMap<>();
	@PostMapping("/CheckETBorNTBRequest")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request) throws JsonMappingException, JsonProcessingException      
    {  
		String MobileNo=((Map<String,String>) request.get("FetchCustomerCASADetailsReqDTO")).get("mobileNumber");
		ETBResponse=ETBResponse.replace("MOBILENUMBER", MobileNo);
		
		resp=mapper.readValue(ETBResponse, Map.class);		
	    return new ResponseEntity<>(resp,HttpStatus.CREATED);
    }
}
