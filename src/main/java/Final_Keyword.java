/*example use case of final class :
  This class cannot be inheritated
  when we try to inherit it gives compile time error
  should be used for class that will be stand alone class
*/
//
//final class Car{
//    int speed;
//
//}

/*example use case of final method:
*   This method cannot be overriden in sub class.
*   This method will be inheritated and can be used by child class.
*   When try to override in subclass results in compile time error.
* */

//class MySystem{
//    final void sendLogs(){
//
//    }
//}
//class Laptop extends MySystem{
//    @Override
//    void sendLogs(){
//
//    }
//}

/* example use case of final variable:
    Value of variable cannot be changed once it is intialized.
    If we declare variable without intializing we can only initialize it in construtor
    and for static final variale we can only initialized in static block

 */


//class Sample{
//    final int key;
//    Sample(){
//        key=12;
//    }
//}

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Final_Keyword {
    //final int key;///instance variable can be only intialized at time of declaration or construcor

    public final static void main(String[] args) throws InterruptedException
    {
        Copy_On_Write cw  = new Copy_On_Write();
          Runnable r1 = () ->
          {
            for(int i=1;i<=10;i++)
                cw.add(i);
          };

          Runnable r2 = () ->
          {
              for(int i=1;i<=10;i++)
                  cw.add(i);
          };

          Thread t1 = new Thread(r1);
          Thread t2 = new Thread(r2);

          t1.start();
          t2.start();

          t1.join();
          t2.join();

          cw.show();
    }
}
