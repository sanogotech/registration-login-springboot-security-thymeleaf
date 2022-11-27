package com.example.registrationlogindemo.exception;

public class BadResourceException extends Exception {
	
	private String rootCauseMessage="";

	public BadResourceException(String exceptionMessage) {
		super(exceptionMessage);
	}

	public void addErrorMessage(String rootCauseMessage) {
		this.setRootCauseMessage(rootCauseMessage);
		
	}

	public String getRootCauseMessage() {
		return rootCauseMessage;
	}

	public void setRootCauseMessage(String rootCauseMessage) {
		this.rootCauseMessage = rootCauseMessage;
	}

}
