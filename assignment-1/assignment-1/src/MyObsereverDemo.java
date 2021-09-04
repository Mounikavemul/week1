public class MyObsereverDemo {

    //Main method to send message
    public static void main(String[] args) {
        MySubject subject = new MySubject();
 
    new ObserverOne(subject);
    new ObserverTwo(subject);
    new ObserverThree(subject);
 
    System.out.println("Sending First Message..");  
    subject.sendMessage("First Message");
    System.out.println("Sending Second Message..");  
    subject.sendMessage("Second Message");
    System.out.println("Sending Third Message..");  
    subject.sendMessage("Third Message");
 
    }
 
 }
 
 