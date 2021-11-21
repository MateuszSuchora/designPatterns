package fasada;

public class OsobaDane {
    public String daneKontaktowe;
    public String imieNazwisko;

    public OsobaDane(String daneKontaktowe, String imieNazwisko) {
        this.daneKontaktowe = daneKontaktowe;
        this.imieNazwisko = imieNazwisko;
    }

    @Override
    public String toString() {
        return  imieNazwisko +" dane kontaktowe: " + daneKontaktowe;
    }
    
    
    
}
