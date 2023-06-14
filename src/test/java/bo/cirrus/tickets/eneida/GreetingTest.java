package bo.cirrus.tickets.eneida;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class GreetingTest
{
    @Test
    public void testJaxrs() {
        RestAssured.when().get("/helloEneida").then()
                .contentType("text/plain")
                .body(equalTo("hello jaxrs Eneida 2do deploy with changes"));
    }

    @Test
    public void testJaxrs2() {
        RestAssured.when().get("/helloEneida").then()
                .contentType("text/plain")
                .body(equalTo("hello jaxrs Eneida 2do deploy with changes"));
    }

    @Test
    public void testServlet() {
        RestAssured.when().get("/servlet/hello").then()
                .contentType("text/plain")
                .body(equalTo("hello servlet Eneida"));
    }

    @Test
    public void testVertx() {
        RestAssured.when().get("/vertx/hello").then()
                .contentType("text/plain")
                .body(equalTo("hello vertx Eneida"));
    }

    @Test
    public void testFunqy() {
        RestAssured.when().get("/funqyHello").then()
                .contentType("application/json")
                .body(equalTo("\"hello funqy Eneida\""));
    }

}
