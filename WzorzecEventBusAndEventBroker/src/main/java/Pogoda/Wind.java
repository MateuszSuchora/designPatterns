package Pogoda;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class Wind implements Observable {

    private Set<Observer> observers = new HashSet<>();
    private int lastOne;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach((e) -> { e.update();});
    }

    public int getLastOne() {
        return lastOne;
    }

    public void randomWind() {
        Random r = new Random();
        int random = r.nextInt(100);
        lastOne=random;
        notifyObservers();
    }

}
