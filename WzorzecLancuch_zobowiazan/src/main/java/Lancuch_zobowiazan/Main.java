package Lancuch_zobowiazan;

public class Main {

    public static void main(String[] args) {
       Handler spam=new HandleSpam();
       Handler wazne=new HandleWazne();
       Handler inne=new HandleInne();
       
       spam.setNextHandler(wazne);
       wazne.setNextHandler(inne);
       
     Message ms1=new Message("Ala ma kota", "spam");
     Message ms2=new Message("Ala ma kota", "inne");
     Message ms3=new Message("Ala ma kota", "wazne");
     
     spam.handle(ms3);
     spam.handle(ms2);
     spam.handle(ms1);
     
    }
    
}
