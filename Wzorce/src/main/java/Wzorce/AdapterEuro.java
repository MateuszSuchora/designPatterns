package Wzorce;
public class AdapterEuro implements Adapter {
    public void taxEuro(double tax){
        
        System.out.println(" Wartosc w euro:");
        System.out.format("%.2f%n", tax);
    }
}
