package hilos;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SyncStack {
    private List<Character> buffer = new ArrayList<>();
    
    public   char pop(){
        synchronized(this){
        //Object o = new Object();
       while(buffer.size() ==0){
            System.out.println("Consumidor en espera...");
            try {
               this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SyncStack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        return buffer.remove(buffer.size()-1);
        }
    }
    public synchronized  void push(char c){
        buffer.add(c);
        this.notify();
    }
}
