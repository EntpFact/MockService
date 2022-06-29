package com.hdfc.ef.Aadhar;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseStatusLoaderController {
	
	public ResponseStatusLoaderController(){}

	public static Map<String, String> mapResponse= new HashMap<>(); 
	public static Map<String, String> OTPValResponse= new HashMap<>(); 
	public static Map<String, String> AdharNameMatch= new HashMap<>(); 
	
	@PostMapping("/AdharOTPGen/ResponseStatus-Update")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  		
		mapResponse=(HashMap<String, String>) request.clone();		
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/AdharOTPVal/ResponseStatus-Update")
    public ResponseEntity<?> AdharOTPValidationResponseUpdate(@RequestBody HashMap request)      
    {  		
		OTPValResponse=(HashMap<String, String>) request.clone();		
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/AdharNameMatch/ResponseStatus-Update")
    public ResponseEntity<?> AdharNameMatchResponseUpdate(@RequestBody HashMap request)      
    {  		
		AdharNameMatch=(HashMap<String, String>) request.clone();		
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
