package com.demo;
import javax.jws.WebService;

import org.apache.cxf.annotations.WSDLDocumentation;

@WebService
@WSDLDocumentation("The docs for echoString")


public interface HelloWorld {
	String sayHi(String text, String text2);
}
