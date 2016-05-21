/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2015
 */
public class AtomicCounter implements Runnable {
    
    static AtomicInteger i = new AtomicInteger();
    
    public static void main(String[] args) {       
        AtomicCounter ac = new AtomicCounter();
        Thread t1 = new Thread(ac);
        t1.setName("T1");
        t1.start();
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread()
                    .getName() + ": " + i.getAndIncrement());
        }
    }
    
    @Override
    public  void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println(Thread.currentThread().getName() 
                    + ": " + i.getAndIncrement());
        }
    }
}
