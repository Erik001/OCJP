package hilos;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRobles
 */
public class Producer implements Runnable{
    private int num;
    private SyncStack theStack;
    private static int counter;

    public Producer(SyncStack theStack) {
        this.theStack = theStack;
        num = ++counter;
    }
    @Override
    public void run(){
        char c  ;
        for(int i=0;i<5;i++){
            c = (char)(Math.random()*26+'A');
            theStack.push(c);
            System.out.println("Producer " +num+" : "+ c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
