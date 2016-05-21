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
public class ThreadSafe {

    public static void main(String[] args) {
        Run r1 = new Run();
        Thread t1 = new Thread(r1, "H");
        Thread t2 = new Thread(r1, "R");
        //Thread t3 = new Thread(r1, "K");
        t2.start();
        t1.start();
        //t3.start();
    }
}

class Run implements Runnable {

    AtomicInteger i = new AtomicInteger();
    AtomicInteger y = new AtomicInteger();

    @Override
    public void run() {
        m();
    }

    synchronized void m() {
        for (;;) {
            if (i.get() % 2 == 0) {
                try {
                    System.out.println(Thread.currentThread()
                            .getName() + i.getAndIncrement() + " ");
                    if (y.get() != 0) {
                        y.getAndSet(0);
                        this.notify();
                    }
                    this.wait();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                try {
                    System.out.println(Thread.currentThread()
                            .getName() + i.getAndIncrement() + " ");
                    y.getAndSet(1);
                    this.notify();
                    this.wait();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (i.get() > 5) {
                this.notifyAll();
                break;
            }
        }
    }
}
