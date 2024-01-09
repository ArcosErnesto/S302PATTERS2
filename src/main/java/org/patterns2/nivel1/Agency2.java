package org.patterns2.nivel1;

public class Agency2 implements Observer{
    private Broker broker;
    private final String NAME = "Agency 2";
    public Agency2(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println(NAME + " New stock price: " + broker.getState());
    }
}
