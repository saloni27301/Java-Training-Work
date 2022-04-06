package com.harman.Exception;

public class InSuffuicientBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	public InSuffuicientBalanceException(String Message) {
		super(Message);
	}

}
