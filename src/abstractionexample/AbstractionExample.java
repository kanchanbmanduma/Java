
package abstractionexample;
import UsingAbstractKeyword.*;
public class AbstractionExample {

    public static void main(String[] args) {
        System.out.println("hello manisha");
        Bus b=new Bus();
        b.start();
        b.run();
        b.stop();
        
        UsingInterface.bus b1=new UsingInterface.bus();
        b1.start();
        b1.stop();
    }

    
}
