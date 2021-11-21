package fasada;

public class GodzinyZajec {
    public double[]  startTime;
    public double[] endTime;
    public String imieNazwisko;
    public String dzien;

    public GodzinyZajec(double[] startTime, double[] endTime, String imieNazwisko, String dzien) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.imieNazwisko = imieNazwisko;
        this.dzien = dzien;
    }

   
    public void wyswietl() {
        System.out.println(imieNazwisko+ "w dniu "+dzien + " ma zajecia:");
        if(startTime.length==0){
            System.out.println("Brak zajec tego dnia");
        }
        else
        for(int i=0;i<startTime.length;i++){
            System.out.println("Od:"+startTime[i]+" do:"+endTime[i]);
        }
    }
    
    
    
    
    
    
    
    
    
}
