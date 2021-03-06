package Wzorce;
public class Obraz implements Przedmiot{
    private double rok_namalowania;
    private double wartość;

    @Override
    public String toString() {
        return "Obraz{" + "rok_namalowania=" + rok_namalowania + ", wartosc" + wartość + '}';
    }

    
    public Obraz(double rok_namalowania) {
        this.rok_namalowania = rok_namalowania;
        setWartość();
    }
    
    
    public double określWartość(){
        return ( 2100 - rok_namalowania)*10;
    }

    public double getRok_namalowania() {
        return rok_namalowania;
    }

    public double getWartość() {
        return wartość;
    }

    private void setWartość() {
        wartość=określWartość();
    }
}

