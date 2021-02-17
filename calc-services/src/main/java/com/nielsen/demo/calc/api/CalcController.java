package com.nielsen.demo.calc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nielsen.demo.calc.models.CalcRequest;
import com.nielsen.demo.calc.services.CalcService;

@RestController
public class CalcController {
	
	@Autowired
	private CalcService calcService;
	
	@GetMapping("/calc/check")
	public String checkService() {
		return "This service is running";
	}
	
	@PostMapping("/calc/add")
	public ResponseEntity<Integer> addNumbers(@RequestBody CalcRequest request) {
		
		return new ResponseEntity<Integer>(calcService.add(request), HttpStatus.OK);
	}

}
