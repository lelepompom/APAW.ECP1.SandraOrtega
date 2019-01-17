package es.upm.miw;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String key) {
        observers.forEach(observer -> observer.update(key));
    }
}
