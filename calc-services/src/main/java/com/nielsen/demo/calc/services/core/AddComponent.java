package com.nielsen.demo.calc.services.core;

import com.nielsen.demo.calc.models.CalcRequest;

public class AddComponent {
	
	public static Integer add(CalcRequest request) {
		if(request.getInput1() != null && request.getInput2() != null) {
			return request.getInput1().intValue() + request.getInput2().intValue();
		} else {
			return 0;
		}
	}

}
