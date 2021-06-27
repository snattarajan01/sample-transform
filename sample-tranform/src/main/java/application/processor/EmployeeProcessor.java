/**
 * 
 */
/**
 * @author Shan
 *
 */
package application.processor;


import org.apache.camel.Exchange;
import org.apache.commons.lang3.arch.Processor;
import org.springframework.stereotype.Component;

@Component
public class EmployeeProcessor extends Processor {

	public EmployeeProcessor(Arch arch, Type type) {
		super(arch, type);
		// TODO Auto-generated constructor stub
	}
	
	public void process(Exchange exchange) throws Exception {
		
	}
	
}
