package WzorzecBudowniczy;
public class Main {
    public static void main(String[] args) {
        int[] tab={1,2,101,-101,5,6,7,8,9,10};
        Budowniczy wav=new BudowniczyWav();
        Budowniczy mp3=new BudowniczyMp3();
        Budowniczy ogg=new BudowniczyOgg();
        Kierownik paniekierowniku=new Kierownik();
        paniekierowniku.wygenerujNapis(wav, tab);
        //paniekierowniku.wygenerujNapis(mp3, tab);
       // paniekierowniku.wygenerujNapis(ogg, tab);
        
    }
    
}
