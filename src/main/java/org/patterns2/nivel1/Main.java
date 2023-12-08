package org.patterns2.nivel1;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Observer agency1 = new Agency1(broker);
        Observer agency2 = new Agency2(broker);
        Observer agency3 = new Agency3(broker);

        broker.setState(15.7);
        broker.setState(25.3);
        broker.setState(12);
    }
}