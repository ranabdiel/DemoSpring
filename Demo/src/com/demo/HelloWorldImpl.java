package com.demo;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Produces("application/json")
@Path("/Hello")	
@WebService(endpointInterface = "com.demo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@GET
	@Path("{text}/{text2}")
	public String sayHi(@PathParam("text") String text, @PathParam("text2") String text2) {
		System.out.println("sayHi called");
        return "Hello " + text + " - " + text2;
	}

}
