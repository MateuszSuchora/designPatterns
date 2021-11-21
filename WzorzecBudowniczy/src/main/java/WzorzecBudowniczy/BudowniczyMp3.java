package WzorzecBudowniczy;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class BudowniczyMp3 extends Budowniczy{
    
    private static String base64Encode(String value) {
        try {
            return Base64.getEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public void budujNaglowek(){
        System.out.println("Mp3Header");
    }
    @Override
    public void budujTagi(){
        System.out.println("Mp3Tags");
    }
    @Override
    public void budujBody(int[] tablica){
        String s="";
        String[] zip = null;
        String k="";
        for(int i=0;i<10;i++){
            s=s+tablica[i]+",";
            k=k+tablica[i];
            zip[i]=base64Encode(k);
            k="";
        }
        System.out.println(base64Encode(s));
    }
}
