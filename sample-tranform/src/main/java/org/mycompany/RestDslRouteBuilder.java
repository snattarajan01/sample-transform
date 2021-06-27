package org.mycompany;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.builder.ExchangeBuilder;
import org.apache.camel.spring.SpringCamelContext;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


/**
 * This RouteBuilder defines our REST API using Camel's REST DSL.
 *
 * A RestConfiguration block first defines how the service will be instantiated.
 * The rest() DSL block then defines each of the RESTful service operations.
 */

public class RestDslRouteBuilder extends SpringRouteBuilder {

	/*
	@Autowired
	private ApplicationContext context;

	@Bean
	public CamelContext camelContext() {
	    return new SpringCamelContext(context);
	}
	*/

    @Override
    public void configure() throws Exception {

      System.out.println("Start-RestDSLRouteBuilder");
        
      
      from("file:input").to("file:output");
/*
        restConfiguration().contextPath("/camel") //
        .port(8080)
        .enableCORS(true)
        .component("servlet")
        .bindingMode(RestBindingMode.json)
        .dataFormatProperty("prettyPrint", "true");
        */
/*
        Exchange insertExchange1 = ExchangeBuilder.anExchange(camelContext()).withHeader("Header", "value").build();
        Exchange responseExchange1 = .send("MSG1", insertExchange1);
        String responseBody1 = responseExchange1.getIn().getBody(String.class);
*/

        System.out.println("End-RestDSLRouteBuilder");

        
        
        /*
         * 
         * 
         * from("timer:foo")
        .endRest()
                .path("/api") // This makes the API available at http://host:port/$CONTEXT_ROOT/api

                .consumes("application/json")
                .produces("application/json")

                // HTTP: GET /api
                .get()
                    .outType(ResponseType.class) // Setting the response type enables Camel to marshal the response to JSON
                    .to("bean:getBean") // This will invoke the Spring bean 'getBean'

                // HTTP: POST /api
                .post()
                    .type(PostRequestType.class) // Setting the request type enables Camel to unmarshal the request to a Java object
                    .outType(ResponseType.class) // Setting the response type enables Camel to marshal the response to JSON
                    .to("bean:postBean");
                    */
        
		//from("timer:foo").transform().constant("Time is "+LocalDateTime.now()).to("log:route-log");

        
        
        

    }

	private Object producer() {
		// TODO Auto-generated method stub
		return null;
	}

}
