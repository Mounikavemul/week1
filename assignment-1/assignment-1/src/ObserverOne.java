
public class ObserverOne extends MyObserver{

    public ObserverOne(MySubject subject){
    this.subject = subject;
    this.subject.attach(this);
    }
 
    @Override
    public void update() {
    System.out.println( "Observer 1 received " +subject.getMessage() );
    }
    }
 
 