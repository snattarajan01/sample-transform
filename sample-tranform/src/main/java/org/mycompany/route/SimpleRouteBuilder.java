package org.mycompany.route;


import org.apache.camel.Exchange;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.mycompany.processor.CreateEmployeeProcessor;
import org.mycompany.processor.MyProcessor;
import org.springframework.stereotype.Component;

import jsonemp.JsonEmp;

@Component
public class SimpleRouteBuilder extends SpringRouteBuilder {
	
	JacksonDataFormat jsonDataFormat = new JacksonDataFormat(JsonEmp.class);

	@Override
	public void configure() throws Exception {
		
		//restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);
		
        //from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");


     //route for REST GET Call
     		/*from("file:C:/inputFolder?noop=true").setHeader(Exchange.HTTP_METHOD, simple("GET"))
     			.to("http://localhost:9000/employeeservice/employees/test").process(new MyProcessor());
*/
     		// route for REST POST Call
     	/*	from("file:C:/inputFolder?noop=true").process(new CreateEmployeeProcessor()).marshal(jsonDataFormat)
     				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
     				.setHeader(Exchange.CONTENT_TYPE, constant("application/json")).to("http://localhost:9000/employeeservice/employees")
     				.process(new MyProcessor());
*/
		//from("timer:foo").transform().constant("Time is "+LocalDateTime.now()).to("log:route-log");
     		
     		
            /*restConfiguration().host("https://dummy.restapiexample.com").port(80);
                    from("timer:rest-client?period=10s")
                                        .to("rest:get:/api/v1/employees")
                                        .log("${body}"); */
                    
                   /* restConfiguration().host("localhost").port(9000);
                    from("timer:rest-client?period=10s")
                                        .to("rest:get:/employeeservice/employees/hi").process(new MyProcessor())
                                        .log("${body}");*/

		
	}
}

