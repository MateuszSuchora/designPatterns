
package Lancuch_zobowiazan;

public class HandleSpam extends Handler{



    @Override
    public void handle(Message mes) {
        if(mes.getType()=="spam"){
            System.out.println("UWAGA! TO JEST SPAM."+mes+" To nie jest wa?na wiadomo??. To nie jest wiadomo?? z kategorii inne.");
        }
        else{
            nextHandler.handle(mes);
            
        }
         
    }
    
}
