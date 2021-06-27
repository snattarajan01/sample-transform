package org.mycompany;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;

import jsonemp.JsonEmp;

@Path("/")
public class EmployeeServiceResource {

	public EmployeeServiceResource() {
	}

	@GET
	@Path("/employees/{name}/")
	public String getCustomer(@PathParam("name") String name) {
		return null;
	}
	
	@POST
	@Path(value = "/employees/create")
	@Produces("application/json")
	@Consumes("application/json")
    public Response secondService(@RequestBody JsonEmp employee) {
		
		JsonEmp emp=new JsonEmp();
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setSalary(employee.getSalary());

		return Response.ok(emp).build();
	}


}
