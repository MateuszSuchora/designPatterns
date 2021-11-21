package Pogoda;


import java.util.Queue;
import java.util.Set;


public class TemperatureAverageObserver implements Observer{
    private final Temperature temperature;
    private Queue<Integer> lastTemp;

    public TemperatureAverageObserver(Temperature temperature) {
        this.temperature = temperature;
    }
    
    
    @Override
    public void update(){
        lastTemp=temperature.getQ();
        int siz=lastTemp.size();
        double srednia=0;
        for(int i=0;i<siz;i++){
            srednia=srednia+lastTemp.poll();
        }
        srednia=srednia/siz;
        System.out.println("Srednia temp = "+srednia+ " stopni Celcjusza");
        
    }
}
