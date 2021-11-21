package Stan;

public class Closed extends State{
    public void goNext(Context in){
        in.setState(new Opening());
        System.out.println("Otwieranie");
    }
}
