package Stan;

public class Open extends State{
    public void goNext(Context in){
        in.setState(new Closing());
        System.out.println("Zamykanie");
    }
}
