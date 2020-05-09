package com.mathoperations.microservicedemo.service;

import org.springframework.stereotype.Service;

import com.mathoperations.microservicedemo.model.MathOpRequest;
import com.mathoperations.microservicedemo.model.MathOpResponse;

@Service
public interface SumAndDiffService {

	public MathOpResponse sumOperation(MathOpRequest mathOpRequest);

	public MathOpResponse diffOperation(MathOpRequest mathOpRequest);
}
