package com.nielsen.demo.calc.services;

import org.springframework.stereotype.Service;

import com.nielsen.demo.calc.models.CalcRequest;
import com.nielsen.demo.calc.services.core.AddComponent;

@Service("calcService")
public class CalcServiceImpl implements CalcService {

	@Override
	public Integer add(CalcRequest request) {
		return AddComponent.add(request);
	}

}
