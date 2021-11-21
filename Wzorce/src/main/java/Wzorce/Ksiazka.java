package Wzorce;

public class Ksiazka implements Przedmiot{
    private double rok_wydania;
    private double numer_wydania;
    private double wartoœæ;

    public Ksiazka(double rok_wydania, double numer_wydania) {
        this.rok_wydania = rok_wydania;
        this.numer_wydania = numer_wydania;
        setWartoœæ();
    }

    @Override
    public String toString() {
        return "Ksiazka{" + "rok_wydania=" + rok_wydania + ", numer_wydania=" + numer_wydania + ", wartosc=" + wartoœæ + '}';
    }
    
    
    public double okreœlWartoœæ(){
        return (2050-rok_wydania)/numer_wydania;
    }

    public double getRok_wydania() {
        return rok_wydania;
    }


    public double getNumer_wydania() {
        return numer_wydania;
    }

    public double getWartoœæ() {
        return wartoœæ;
    }

    private void setWartoœæ() {
        wartoœæ=okreœlWartoœæ();
    }
}
