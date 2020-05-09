package com.mathoperations.microservicedemo.serviceimpl;

import org.springframework.stereotype.Component;

import com.mathoperations.microservicedemo.model.MathOpRequest;
import com.mathoperations.microservicedemo.model.MathOpResponse;
import com.mathoperations.microservicedemo.service.SumAndDiffService;

@Component
public class SumAndDiffServiceImpl implements SumAndDiffService {

	@Override
	public MathOpResponse sumOperation(MathOpRequest mathOpRequest) {
		MathOpResponse MathOpResponse = new MathOpResponse();
		MathOpResponse.setResult(
				String.valueOf(Integer.valueOf(mathOpRequest.getX()) + Integer.valueOf(mathOpRequest.getY())));
		return MathOpResponse;
	}

	@Override
	public MathOpResponse diffOperation(MathOpRequest mathOpRequest) {
		MathOpResponse MathOpResponse = new MathOpResponse();
		MathOpResponse.setResult(String
				.valueOf(Math.abs(Integer.valueOf(mathOpRequest.getX()) - Integer.valueOf(mathOpRequest.getY()))));
		return MathOpResponse;
	}

}
