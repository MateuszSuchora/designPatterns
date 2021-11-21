package Stan;

public class Context {
    public State current;
    
    public void goNext(){
        current.goNext(this);
    }

    public void setState(State current) {
        this.current = current;
    }

    public State getState() {
        return current;
    }
    
    
    
}
