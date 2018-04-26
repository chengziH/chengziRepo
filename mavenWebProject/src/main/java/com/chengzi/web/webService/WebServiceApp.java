package com.chengzi.web.webService;

public class WebServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.xml.ws.Endpoint.publish("http://127.0.0.1:8080/mavenWebProject/helloWorldWebService", new HelloWorldWebServiceImpl());
		System.out.println("发布成功");
	}

}
