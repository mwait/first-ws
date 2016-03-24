package com.wait.ws.soap;

import com.wait.ws.soap.dto.PaymentProcessorRequest;
import com.wait.ws.soap.dto.PaymentProcessorResponse;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest) {
		
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		//todo dorobic logike
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
