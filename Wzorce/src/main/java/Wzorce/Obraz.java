package Wzorce;
public class Obraz implements Przedmiot{
    private double rok_namalowania;
    private double wartoœæ;

    @Override
    public String toString() {
        return "Obraz{" + "rok_namalowania=" + rok_namalowania + ", wartosc" + wartoœæ + '}';
    }

    
    public Obraz(double rok_namalowania) {
        this.rok_namalowania = rok_namalowania;
        setWartoœæ();
    }
    
    
    public double okreœlWartoœæ(){
        return ( 2100 - rok_namalowania)*10;
    }

    public double getRok_namalowania() {
        return rok_namalowania;
    }

    public double getWartoœæ() {
        return wartoœæ;
    }

    private void setWartoœæ() {
        wartoœæ=okreœlWartoœæ();
    }
}

