package Wzorce;
public class AdapterEurozDolar implements Adapter {
    public void taxEuro(double tax){
        System.out.println(" Wartosc w euro:");
        System.out.format("%.2f%n", tax*3/3.8);
    }
}
