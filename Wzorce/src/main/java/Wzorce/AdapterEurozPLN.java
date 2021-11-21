package Wzorce;
public class AdapterEurozPLN implements Adapter {
    public void taxEuro(double tax){
        System.out.println(" Wartosc w euro:");
        System.out.format("%.2f%n", tax/4.2);
    }
}