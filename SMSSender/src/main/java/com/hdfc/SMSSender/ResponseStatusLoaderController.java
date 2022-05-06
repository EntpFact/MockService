package com.hdfc.SMSSender;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseStatusLoaderController {
//	SpringBootSoapServiceApplication app=new SpringBootSoapServiceApplication();
	public static Map<String, String> mapResponse= new HashMap<>(); 
	
	/*
	 * {{put("errorDetail",""); put("messageHash",""); put("refNo","");
	 * put("statusCode",""); put("datatimeGen",""); put("datetimeExpire","");
	 * put("passwordValue",""); put("fillerField1",""); put("fillerField2","");
	 * put("fillerField3",""); put("fillerField4",""); put("fillerField5",""); }};	 */
	
	@PostMapping("/ResponseStatus-Update")
    public ResponseEntity<?> mockhit(@RequestBody HashMap request)      
    {  
		System.out.println("Response: "+request.toString());
		//app.statusLoader()=(HashMap<String, String>) request.clone();
		mapResponse=(HashMap<String, String>) request.clone();
		System.out.println("Status:"+mapResponse);
	    return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
