package WzorzecKomenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        
        int godz=0;
        int min=0;
        File file=new File("Zadanie.txt");
        ArrayList < Task > commandQueue = new ArrayList <>();
        commandQueue.add(new TaskSave1(0,0));
	commandQueue.add(new TaskSave1(0,1));
	commandQueue.add(new TaskSave2(0,2));
	commandQueue.add(new TaskSave2(0,3));
	commandQueue.add(new TaskSave3(0,4));
        commandQueue.add(new TaskSave3(0,5));
        while(true){
            for(int i=0;i<6;i++){
                if(commandQueue.get(i).czyJuz(godz,min)){
                    commandQueue.get(i).wykonaj(file);
                }
            }
            try {
                Thread.sleep(60000);
            }catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(godz==23&&min==59){
                godz=0;
                min=0;
            }
            else if(min==59){
                min=0;
                godz=godz+1;
            }
            else{
                min=min+1;
            }
        }
        
           
    }
    
}
