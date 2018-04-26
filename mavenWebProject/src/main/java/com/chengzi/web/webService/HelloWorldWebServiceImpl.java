package com.chengzi.web.webService;

import javax.jws.WebMethod;

@javax.jws.WebService(endpointInterface = "com.chengzi.web.webService.HelloWorldWebService",serviceName = "helloWorldWebService")
public class HelloWorldWebServiceImpl implements HelloWorldWebService{

	public String sayHello(String name) {
		System.out.println(name  + " 在说 HelloWorld!");
		return name  + " 在说 HelloWorld!";
	}
	
	/**
	 * 不发布
	 */
	@WebMethod(exclude = true)
	public String sayHello2(String name) {
		System.out.println(name  + " 在说 HelloWorld22!");
		return name  + " 在说 HelloWorld22!";
	}

}
