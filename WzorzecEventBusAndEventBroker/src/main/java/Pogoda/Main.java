package Pogoda;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Wind w = new Wind();
        Temperature t = new Temperature();

        
       
        TemperatureAverageObserver tempObserv = new TemperatureAverageObserver(t);
        WindChillObserver windObserv = new WindChillObserver(w,t);
        t.attach(tempObserv);
        w.attach(windObserv);
        while(true){
            w.randomWind();
            t.randomTemperature();
            Thread.sleep(1000);
        }

    //wersja 2 
    
    
    
    }

}
