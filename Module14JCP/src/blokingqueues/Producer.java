/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokingqueues;

import java.util.concurrent.BlockingQueue;
/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2015
 */
public class Producer implements Runnable {

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                queue.put(i);
                System.out.println("Producer: "+i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
