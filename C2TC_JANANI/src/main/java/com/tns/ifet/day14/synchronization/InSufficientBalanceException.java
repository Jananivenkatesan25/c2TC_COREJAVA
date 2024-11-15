package com.tns.ifet.day14.synchronization;


public class InSufficientBalanceException extends Exception {

	public InSufficientBalanceException() {
		super("Insufficient balance in your account");
	}

	public InSufficientBalanceException(String message) {
		super(message);
	}
}

