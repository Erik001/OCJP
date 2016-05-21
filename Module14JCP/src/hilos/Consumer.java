package hilos;


import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer implements  Runnable{
    private SyncStack theStack;
    private int num ;
    private static int counter;

    public Consumer(SyncStack theStack) {
        this.theStack = theStack;
        num = ++counter;
    }
    @Override
    public void run(){
        char c;
        for(int i=0;i<5;i++){
            c = theStack.pop();
            System.out.println("Comnsumidor " + num +" : "+ c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
