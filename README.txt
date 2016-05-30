<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.ws.wait.com/">
  
  <soapenv:Header>
    <wsse:Security
       xmlns="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
       xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
       xmlns:env="http://schemas.xmlsoap.org/soap/envelope/"
     env:mustUnderstand="1">
     <wsse:UsernameToken
       xmlns="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
       xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd"
       xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
       <wsse:Username>user</wsse:Username>
       <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">password</wsse:Password>
     </wsse:UsernameToken>
   </wsse:Security>
   </soapenv:Header>
   
   <soapenv:Body>
      <soap:processPayment>
         <!--Optional:-->
         <paymentProcessorRequest>
            <creditCardInfo>
               <cardNumber>12345</cardNumber>
               <expirtyDate>2015-01-31T19:32:52+00:00</expirtyDate>
               <firstName>test</firstName>
               <lastName>test</lastName>
               <secCode>1234</secCode>
               <Address>Pl</Address>
            </creditCardInfo>
            <amount>200</amount>
         </paymentProcessorRequest>
      </soap:processPayment>
   </soapenv:Body>
</soapenv:Envelope>


glassfish metro
generowanie klas w wsdla
wsimport -keep -d /Users/name/Documents/ http://localhost:8080/first-ws/services?wsdl