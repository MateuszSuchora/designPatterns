package komenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Odbiorca {

    public Odbiorca() {
    }
    
    
   
    public void TaskSave1() throws FileNotFoundException{
        try (PrintWriter zapis = new PrintWriter("savetofile.txt")) {
            zapis.println("savetofile");
        }
        System.out.println("Poprawne zapisanie 1");
    }
    
    
    public void TaskSave2() throws FileNotFoundException{
        try (PrintWriter zapis = new PrintWriter("liczba_1000.txt")) {
            zapis.println("10000");
        }
        System.out.println("Poprawnie zapisano 2");
    }
    
     
    public void TaskSave3() throws FileNotFoundException {

            Scanner scan = new Scanner(new File("lista.txt"));
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            while (scan.hasNextLine()) {
               int element = scan.nextInt();
              list.add(element);
            }
            for (int i = 0; i < list.size(); i++){
              
                sum = sum + list.get(i);    
            
            }
            System.out.println(sum);
            
            try (PrintWriter zapis = new PrintWriter("suma_zapisu.txt")) {
            zapis.println(sum);
             }
            
             } 
    
   

   
    
    
    
}
