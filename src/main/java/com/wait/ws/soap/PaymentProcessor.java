package com.wait.ws.soap;

import com.wait.ws.soap.dto.PaymentProcessorRequest;
import com.wait.ws.soap.dto.PaymentProcessorResponse;

public interface PaymentProcessor {

	public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest);
}
