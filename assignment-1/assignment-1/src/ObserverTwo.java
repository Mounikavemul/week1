
public class ObserverTwo extends MyObserver{

    public ObserverTwo(MySubject subject){
    this.subject = subject;
    this.subject.attach(this);
    }
 
    @Override
    public void update() {
        System.out.println( "Observer 2 received " +subject.getMessage() );
    }
    }
 
 