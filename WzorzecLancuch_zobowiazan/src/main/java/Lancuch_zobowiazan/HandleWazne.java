
package Lancuch_zobowiazan;


public class HandleWazne extends Handler{

   @Override
    public void handle(Message mes) {
        if(mes.getType()=="wazne"){
            System.out.println("UWAGA! WA?NA WIADOMO??."+mes+" To nie jest spam. To nie jest wiadomo?? z kategorii inne.");
        }
        else{
            nextHandler.handle(mes);
            
        }
         
    }
    
}
