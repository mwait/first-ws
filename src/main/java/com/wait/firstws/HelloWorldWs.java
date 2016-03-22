package com.wait.firstws;
import javax.jws.WebMethod;
import javax.jws.WebService;

/*cxf webservice
 *http://localhost:8080/first-ws/services
 *wyswietla serwisy 
 *http://localhost:8080/first-ws/services/hello?wsdl
 *plik wsdl
 * 
 */
@WebService 
public class HelloWorldWs {

	@WebMethod
	public String sayHello() {
		return "Hello From Ws";
	}
}
