package org.patterns2.nivel1;

public class Agency3 extends Observer{
    private final String NAME = "Agency 3";
    public Agency3(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println(NAME + " New stock price: " + super.broker.getState());
    }
}
