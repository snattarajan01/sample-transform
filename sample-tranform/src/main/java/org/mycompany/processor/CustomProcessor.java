package org.mycompany.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 * This is a POJO which defines a response format.
 * This allows Camel to serialise the response into JSON, using the Jackson library.
 */
@Component
public class CustomProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
		// Get input from exchange
		String msg = exchange.getIn().getBody(String.class);
		// set output in exchange
		exchange.getOut().setBody("Hello World " + msg);

    }

}
