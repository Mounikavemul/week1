import java.util.ArrayList;
import java.util.List;


public class MySubject {

   private List<MyObserver> observers = new ArrayList<MyObserver>();
   private String message;

   public String getMessage() {
   return message;
   }

   public void sendMessage(String message) {
   this.message = message;
   notifyAllObservers();
   }

   public void attach(MyObserver observer){
   observers.add(observer);      
   }

   public void notifyAllObservers(){
       //Calling update method of each Observer to update the new message
   for (MyObserver observer : observers) {
   observer.update();
   }
   }   
}