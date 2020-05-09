package com.mathoperations.microservicedemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mathoperations.microservicedemo.constants.SumAndDiffConstants;
import com.mathoperations.microservicedemo.model.MathOpRequest;
import com.mathoperations.microservicedemo.model.MathOpResponse;
import com.mathoperations.microservicedemo.service.SumAndDiffService;
import com.mathoperations.microservicedemo.validate.MathOpValidator;

@RestController
public class SumAndDiffController {

	private static final Logger logger = LoggerFactory.getLogger(SumAndDiffController.class);

	@Autowired
	MathOpValidator validator;

	@Autowired
	SumAndDiffService service;

	@PostMapping(value = SumAndDiffConstants.SUM_URI, produces = SumAndDiffConstants.ACCEPTABLE_VALUE)
	public @ResponseBody MathOpResponse calculateSum(@RequestBody MathOpRequest mathOpRequest) {
		logger.info("Entering SumAndDiffController -- calculateSum method");
		validator.validateRequest(mathOpRequest);
		MathOpResponse response = service.sumOperation(mathOpRequest);
		logger.info("Exiting SumAndDiffController -- calculateSum method");
		return response;

	}

	@PostMapping(value = SumAndDiffConstants.DIFF_URI, produces = SumAndDiffConstants.ACCEPTABLE_VALUE)
	public @ResponseBody MathOpResponse calculateDiff(@RequestBody MathOpRequest mathOpRequest) {
		logger.info("Entering SumAndDiffController -- calculateDiff method");
		validator.validateRequest(mathOpRequest);
		MathOpResponse response = service.diffOperation(mathOpRequest);
		logger.info("Exiting SumAndDiffController -- calculateDiff method");
		return response;
	}

}
