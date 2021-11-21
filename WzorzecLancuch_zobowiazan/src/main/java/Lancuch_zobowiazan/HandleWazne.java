
package Lancuch_zobowiazan;


public class HandleWazne extends Handler{

   @Override
    public void handle(Message mes) {
        if(mes.getType()=="wazne"){
            System.out.println("UWAGA! WA¯NA WIADOMOŒÆ."+mes+" To nie jest spam. To nie jest wiadomoœæ z kategorii inne.");
        }
        else{
            nextHandler.handle(mes);
            
        }
         
    }
    
}
