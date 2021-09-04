public class ObserverThree extends MyObserver{

    public ObserverThree(MySubject subject){
    this.subject = subject;
    this.subject.attach(this);
    }
 
    @Override
    public void update() {
        System.out.println( "Observer 3 received " +subject.getMessage() );
    }
    }
 
 