package com.hdfc.ef.mock;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseLoaderController<V, K> {
	public ResponseLoaderController() {}
	public static Map<String, String> OTPGenResponse= new HashMap<>(); 
	public static Map<String, String> mapResponse= new HashMap<>(); 
	 
	 @Autowired
	 OTPVerifier otpVerifier;
	 @Autowired
	 OTPGenerator otpGenerator;
	 
	 @PostMapping("/OTPGenResponseStatusUpdate")	
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  
		OTPGenResponse=(HashMap<String, String>) request.clone();
		otpGenerator.responseUpdate(OTPGenResponse);
	    return new ResponseEntity<>(HttpStatus.CREATED);		
    }	
	@PostMapping("/OTPVerResponseStatusUpdate")	
    public ResponseEntity<?> mockotpverify(@RequestBody HashMap request)      
    {  
		mapResponse=(HashMap<String, String>) request.clone();	
		otpVerifier.responseUpdate(mapResponse);
	    return new ResponseEntity<>(HttpStatus.CREATED);		
    }
}
