package WzorzecKomenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskSave3 implements Task {
    private final int godzina;
    private final int minuta;

    public TaskSave3(int godzina, int minuta) {
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
    public void wykonaj(File file) throws FileNotFoundException {
        
            
            Scanner scan;
            scan = new Scanner(new File("file2.txt"));
        
            ArrayList <Integer> list=new ArrayList <>();
            list = new ArrayList <>();
            int sum = 0;
            while (scan.hasNextLine()) {
                String element = scan.next();
                int el=Integer.parseInt(element);
                list.add(el);
              
     
            }
            scan.close();
            for (int i = 0; i < list.size(); i++){
                sum = sum + list.get(i);    
            }
            
            System.out.println("Suma:"+sum);
            
            PrintWriter zapis = new PrintWriter(file);
            zapis.println("Suma:"+sum);
            zapis.close();
            
        
            
            
            
        
    }

   
    
}
