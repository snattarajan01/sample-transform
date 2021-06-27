package org.mycompany.processor;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.mycompany.RestOrderService;
import org.springframework.stereotype.Component;

import jsonemp.JsonEmp;

/**
 * This is a POJO which defines a response format.
 * This allows Camel to serialise the response into JSON, using the Jackson library.
 */
@Component
public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
		// Get input from exchange
		String msg = exchange.getIn().getBody(String.class);
		// set output in exchange
		exchange.getOut().setBody("Hello World " + msg);

    }

}
