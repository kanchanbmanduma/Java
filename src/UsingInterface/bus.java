
package UsingInterface;

public class bus implements Vehicle{
    
    @Override
    public void start(){
        System.out.println("hey");
    }
    @Override
    public void stop(){
        System.out.println("bye");
    }
}
