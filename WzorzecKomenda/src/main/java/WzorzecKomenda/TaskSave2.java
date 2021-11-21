package WzorzecKomenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskSave2 implements Task {
    private final int godzina;
    private final int minuta;

    public TaskSave2(int godzina, int minuta) {
        this.godzina = godzina;
        this.minuta = minuta;
    }
    
    public boolean  czyJuz(int g, int m){
        if(g==godzina&&m==minuta){
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public void wykonaj(File file) throws FileNotFoundException{
        
        
            PrintWriter zapis = new PrintWriter(file);
            zapis.println("10000");
            zapis.close();
            
            
            System.out.println("Task 2 complite");
        
        
    }
}
