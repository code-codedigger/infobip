package com.mathoperations.microservicedemo.validate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.mathoperations.microservicedemo.exceptions.InvalidInputException;
import com.mathoperations.microservicedemo.model.MathOpRequest;

@Component
public class MathOpValidator {
	private static final Logger logger = LoggerFactory.getLogger(MathOpValidator.class);

	/**
	 * @param mathOpRequest
	 */
	public void validateRequest(MathOpRequest mathOpRequest) {
		logger.info("Entering MathOpValidator -- validateRequest method");
		if (!StringUtils.hasText(mathOpRequest.getX())) {
			throw new InvalidInputException("Invalid value x : ");
		}

		if (!StringUtils.hasText(mathOpRequest.getY())) {
			throw new InvalidInputException("Invalid value y : ");
		}
		logger.info("Exiting MathOpValidator -- validateRequest method");
	}
}
