package fasada;

import java.util.ArrayList;

public class Fasada {
    ArrayList<OsobaDane> daneKontaktowe;
    ArrayList<GodzinyZajec> godz;

    public Fasada(ArrayList<OsobaDane> daneKontaktowe, ArrayList<GodzinyZajec> godz) {
        this.daneKontaktowe = daneKontaktowe;
        this.godz = godz;
    }
    
    public void wyswietlDane(){
        String s;
        System.out.println("Dane Kontaktowe:");
        for(int i=0;i<daneKontaktowe.size();i++){
            s=daneKontaktowe.get(i).toString();
            System.out.println(s);
        }
    }
    
    public void wyswietlGodz(){
        System.out.println("Godziny zajec:");
        for(int i=0;i<godz.size();i++){
            godz.get(i).wyswietl();
        }
    }
    
    
}
