package com.wait.ws.soap;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.wait.ws.soap.dto.PaymentProcessorRequest;
import com.wait.ws.soap.dto.PaymentProcessorResponse;
@WebService(name = "PaymentProcessor")
public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public @WebResult(name = "response") PaymentProcessorResponse processPayment(@WebParam(name = "paymentProcessorRequest")  PaymentProcessorRequest paymentProcessorRequest) {
		
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		//todo dorobic logike
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
