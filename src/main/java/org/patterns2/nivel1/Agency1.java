package org.patterns2.nivel1;

    public class Agency1 implements Observer{
        private Broker broker;
        private final String NAME = "Agency 1";
        public Agency1(Broker broker) {
            this.broker = broker;
            this.broker.attach(this);
        }

        @Override
        public void update() {
            System.out.println(NAME + " New stock price: " + broker.getState());
        }
    }
