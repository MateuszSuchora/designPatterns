package Stan;

public class Opening extends State{
    public void goNext(Context in){
        in.setState(new Open());
        System.out.println("Otwarte");
    }
    
}
