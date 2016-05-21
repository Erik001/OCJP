/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronousqueue;

import java.util.concurrent.SynchronousQueue;

/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2014
 */
public class QueueConsumer implements Runnable {

	private SynchronousQueue<String> queue;

	public QueueConsumer(SynchronousQueue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		try {
                    String event;
			event = queue.take();
			// thread will block here
			System.out.printf("[%s] consumed event : %s %n", Thread
					.currentThread().getName(), event);
                        
                        event = queue.take();
			// thread will block here
			System.out.printf("[%s] consumed event : %s %n", Thread
					.currentThread().getName(), event);
                                
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}