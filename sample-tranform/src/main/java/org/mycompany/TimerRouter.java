package org.mycompany;


import java.time.LocalDateTime;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.RoutePolicy;
import org.springframework.stereotype.Component;

public class TimerRouter extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		
		//restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		
		



		from("timer:foo").transform().constant("Time is "+LocalDateTime.now()).to("log:route-log");
		
	}
}

