package application.resource;

import java.awt.PageAttributes.MediaType;

import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

public class ApplicationResource extends RouteBuilder {
	
	public void configure() throws Exception {
		//restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		
		//rest().get("/hello-world").produces(org.springframework.http.MediaType.APPLICATION_JSON_VALUE).route().setBody(constant("Welcome to Java"));
		
	}
}

