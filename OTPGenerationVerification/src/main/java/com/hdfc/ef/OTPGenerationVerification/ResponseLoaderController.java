package com.hdfc.ef.OTPGenerationVerification;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseLoaderController {
	public static Map<String, String> OTPGenResponse= new HashMap<>(); 
	public static Map<String, String> mapResponse= new HashMap<>(); 
		 
	 @PostMapping("/OTPGenResponseStatusUpdate")	
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  
		OTPGenResponse=(HashMap<String, String>) request.clone();
		
	    return new ResponseEntity<>(HttpStatus.CREATED);		
    }	
	@PostMapping("/OTPVerResponseStatusUpdate")	
    public ResponseEntity<?> mockotpverify(@RequestBody HashMap request)      
    {  
		mapResponse=(HashMap<String, String>) request.clone();	
	
	    return new ResponseEntity<>(HttpStatus.CREATED);		
    }
}
