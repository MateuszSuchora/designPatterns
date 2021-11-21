package Pogoda;

import java.util.ArrayList;

public class EventBroker {

    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Observable> publishers = new ArrayList<>();

    public void addPublisher(Observable event) {
        publishers.add(event);
    }

    public void addObserver(Observer event) {
        observers.add(event);
    }
}
