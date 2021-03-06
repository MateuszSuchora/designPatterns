package Wzorce;

public class Ksiazka implements Przedmiot{
    private double rok_wydania;
    private double numer_wydania;
    private double wartość;

    public Ksiazka(double rok_wydania, double numer_wydania) {
        this.rok_wydania = rok_wydania;
        this.numer_wydania = numer_wydania;
        setWartość();
    }

    @Override
    public String toString() {
        return "Ksiazka{" + "rok_wydania=" + rok_wydania + ", numer_wydania=" + numer_wydania + ", wartosc=" + wartość + '}';
    }
    
    
    public double określWartość(){
        return (2050-rok_wydania)/numer_wydania;
    }

    public double getRok_wydania() {
        return rok_wydania;
    }


    public double getNumer_wydania() {
        return numer_wydania;
    }

    public double getWartość() {
        return wartość;
    }

    private void setWartość() {
        wartość=określWartość();
    }
}
