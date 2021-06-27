package org.mycompany.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import jsonemp.JsonEmp;



public class CreateEmployeeProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody(String.class));
    	JsonEmp emp = new JsonEmp();
		emp.setName("camel-employee");
		emp.setAge("20");
		emp.setSalary("30000");
		exchange.getIn().setBody(emp);
    }

}

