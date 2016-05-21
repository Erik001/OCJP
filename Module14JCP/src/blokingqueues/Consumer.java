/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blokingqueues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2015
 */
public class Consumer implements Runnable {

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Consumer: " + queue.take());
                Thread.sleep(100);
                //System.out.println(queue.poll()); 
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
