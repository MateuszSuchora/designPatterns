package Stan;

public class Closing extends State{
    public void goNext(Context in){
        in.setState(new Closed());
        System.out.println("Zamkniete");
    }
}
