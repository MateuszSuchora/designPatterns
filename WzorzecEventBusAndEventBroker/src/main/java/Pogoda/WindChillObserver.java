package Pogoda;

public class WindChillObserver implements Observer {

    private final Wind wind;
    private final Temperature temperature;
    private int lastWind;
    private int lastTemp;

    public WindChillObserver(Wind wind, Temperature temp) {
        this.wind = wind;
        this.temperature = temp;
    }

    @Override
    public void update() {
        lastTemp = temperature.getLastOne();
        lastWind = wind.getLastOne();
        double odczuwalna = lastTemp - ((lastWind / 100) * 5);
        if (lastWind > 0) {
            System.out.println("Temperatura odczuwalna: " + odczuwalna + " Stponi Celcjusza");
        } else {
            System.out.println("Temperatura odczuwalna: " + lastTemp + " Stponi Celcjusza");
        }
    }

}
