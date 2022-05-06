package com.hdfc.OTPVerification;

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
	@PostMapping("/ResponseStatus-Update")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  
		mapResponse=(HashMap<String, String>) request.clone();	
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
