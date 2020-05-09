package com.mathoperations.microservicedemo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "x", "y" })
//remove below if you dont have lombok.
@Getter
@Setter
public class MathOpRequest {
	@JsonProperty("x")
	private String x;
	@JsonProperty("y")
	private String y;

//Comment below if you have lombok.
	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
}
