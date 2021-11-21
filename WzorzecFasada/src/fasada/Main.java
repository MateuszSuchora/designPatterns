package fasada;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        OsobaDane o1=new OsobaDane("adam.kobus@poczta.umcs.lublin.pl","Adam Kobus");
        OsobaDane o2=new OsobaDane("adam.misiura@poczta.umcs.lublin.pl","Adam Misiura");
        OsobaDane o3=new OsobaDane("lukasz.kwasniewicz@poczta.umcs.lublin.pl","Lukasz Kwasniewicz");
        //wtorek
        double[] startAK={16,17.40,19.20};
        double[] endAK={17.30,19.10,20.50};
        
        double[] startAM={15.30,17.40,19.20};
        double[] endAM={17,19.10,20.50};
        
        double[] startLK={};
        double[] endLK={};
        
        GodzinyZajec g1=new GodzinyZajec(startAK,endAK,"Adam Kobus", "wtorek");
        GodzinyZajec g2=new GodzinyZajec(startAM,endAM,"Adam Misiura", "wtorek");
        GodzinyZajec g3=new GodzinyZajec(startLK,endLK,"Lukasz Kwasniewicz", "wtorek");
        ArrayList<OsobaDane> osoby=new ArrayList<>();
        osoby.add(o1);
        osoby.add(o2);
        osoby.add(o3);
        
        ArrayList<GodzinyZajec> godz=new ArrayList<>();
        godz.add(g1);
        godz.add(g2);
        godz.add(g3);
        
        
        Fasada f=new Fasada(osoby,godz);
        f.wyswietlDane();
        f.wyswietlGodz();
        
    }
    
}
