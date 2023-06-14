package bo.cirrus.tickets.eneida;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Funq
    public String funqyHello() {
        return "hello funqy Eneida";
    }
}
