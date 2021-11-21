package Pogoda;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class Temperature implements Observable {

    private Set<Observer> observers = new HashSet<>();
    private Queue<Integer> q = new LinkedList<>();
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
        observers.forEach(Observer::update);
    }

    public Set<Observer> getObservers() {
        return observers;
    }

    public Queue<Integer> getQ() {
        return q;
    }

    public int getLastOne() {
        return lastOne;
    }

    public void randomTemperature() {
        Random r = new Random();
        int random = r.nextInt(61) - 30;
        if (q.size() == 5) {
            int i = q.remove();
            q.add(random);
        } else {
            q.add(random);
        }
        lastOne = random;
        notifyObservers();
    }

}
