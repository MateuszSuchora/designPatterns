package Lancuch_zobowiazan;

public class HandleInne extends Handler{
    @Override
    public void handle(Message mes) {
        if(mes.getType()!="wazne" && mes.getType()!="spam" ){
            System.out.println(mes+"To nie jest spam. To nie jest wa¿na wiadomoœæ.");
        }
        else{
            nextHandler.handle(mes);
            
        }
         
    }
}
