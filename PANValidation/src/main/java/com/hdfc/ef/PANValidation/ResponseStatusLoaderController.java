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

	public static Map<String, String> mapResponse= new HashMap<>(); 

	@PostMapping("/PANDetails/ResponseStatus-Update")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  
		System.out.println("Response: "+request.toString());		
		mapResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	@PostMapping("/ETBCheckRequest/ResponseStatus-Update")
    public ResponseEntity<?> ETBCheckResponseUpdate(@RequestBody HashMap request)      
    {  
		System.out.println("Response: "+request.toString());		
		mapResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/DedupeCheckRequest/ResponseStatus-Update")
    public ResponseEntity<?> DedupeCheckResponseUpdate(@RequestBody HashMap request)      
    {  
		System.out.println("Response: "+request.toString());		
		mapResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
	@PostMapping("/EnquireBureauRequest/ResponseStatus-Update")
    public ResponseEntity<?> EnquireBureauResponseUpdate(@RequestBody HashMap request)      
    {  
		System.out.println("Response: "+request.toString());		
		mapResponse=(HashMap<String, String>) request.clone();
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
