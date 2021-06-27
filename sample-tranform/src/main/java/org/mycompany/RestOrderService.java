package org.mycompany;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.camel.ProducerTemplate;

import jsonemp.JsonEmp;

@Path("/emp/")
@Produces("application/json")
public class RestOrderService {

    private ProducerTemplate producer;

    public void setProducerTemplate(ProducerTemplate producerTemplate) {
    	this.producer = producerTemplate;
    }

    @GET
    @Path("/{id}")
    public Response getOrder(@PathParam("id") int id) {
        JsonEmp emp = producer.requestBody("direct:getOrder",
                                           id, JsonEmp.class);
        if (emp != null) {
            return Response.ok(emp).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    public Response updateOrder(JsonEmp emp) {
        producer.sendBody("direct:updateOrder", emp);
return Response.ok().build();
    }

    @POST
    public Response createOrder(JsonEmp emp) {
        String id = producer.requestBody("direct:createOrder",
                                         emp, String.class);
        return Response.ok(id).build();
    }

    @DELETE
    @Path("/{id}")
    public Response cancelOrder(@PathParam("id") int id) {
        producer.sendBody("direct:cancelOrder", id);
return Response.ok().build();
    }
}

