package com.wait.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="paymentProcessorResponse")
public class PaymentProcessorResponse {

	//nie musimy oznaczac adnotacja, domyslnie bedzie serializowany
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	
}
