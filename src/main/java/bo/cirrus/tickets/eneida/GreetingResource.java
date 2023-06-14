package bo.cirrus.tickets.eneida;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/helloEneida")
public class GreetingResource {

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String hello() {
    //     System.out.println("Hello World with JAXRS!");
    //     return "hello jaxrs Eneida";
    // }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloEneida() {
        System.out.println("Hello World with JAXRS nueva función!");
        return "hello jaxrs Eneida 2do deploy with changes";
    }
}
