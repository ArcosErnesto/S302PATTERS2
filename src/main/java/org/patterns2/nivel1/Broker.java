package org.patterns2.nivel1;

import java.util.ArrayList;

public class Broker {
    private ArrayList<Observer> observers = new ArrayList<>();
    private double state;

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(observer -> observer.update());
    }

}
