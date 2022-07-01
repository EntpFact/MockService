package com.hdfc.ef.PANValidation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseStatusLoaderController {

	public static Map<String, String> PanDetailsResponse= new HashMap<>(); 
	public static Map<String, String> ETBCheckResponse= new HashMap<>(); 
	public static Map<String, String> DedupeCustomerRequest= new HashMap<>(); 
	public static Map<String, String> DedupeGetStatus= new HashMap<>(); 
	public static Map<String, String> DedupeResponse= new HashMap<>(); 
	public static Map<String, String> EnquireBureauResponse= new HashMap<>(); 

	@PostMapping("/PANDetails/ResponseStatus-Update")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  				
		PanDetailsResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	@PostMapping("/ETBCheckRequest/ResponseStatus-Update")
    public ResponseEntity<?> ETBCheckResponseUpdate(@RequestBody HashMap request)      
    {  				
		ETBCheckResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/DedupeCheckPostCustomerRequest/ResponseStatus-Update")
    public ResponseEntity<?> DedupeCheckResponseUpdate(@RequestBody HashMap request)      
    {  		
		DedupeCustomerRequest=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/DedupeCheckGetStatus/ResponseStatus-Update")
    public ResponseEntity<?> DedupeCheckGetStatusResponseUpdate(@RequestBody HashMap request)      
    {  			
		DedupeGetStatus=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/DedupeCheckGetResponse/ResponseStatus-Update")
    public ResponseEntity<?> DedupeResponseUpdate(@RequestBody HashMap request)      
    {  			
		DedupeResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/EnquireBureauRequest/ResponseStatus-Update")
    public ResponseEntity<?> EnquireBureauResponseUpdate(@RequestBody HashMap request)      
    {  				
		EnquireBureauResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
