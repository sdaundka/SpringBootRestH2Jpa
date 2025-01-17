package com.demorestapp.resource.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	private Date date;
	private HttpStatus statusCode;
	private String message;
	
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponse(Date date, HttpStatus statusCode, String message) {
		super();
		this.date = date;
		this.statusCode = statusCode;
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [date=" + date + ", statusCode=" + statusCode + ", message=" + message + "]";
	}
	
}
