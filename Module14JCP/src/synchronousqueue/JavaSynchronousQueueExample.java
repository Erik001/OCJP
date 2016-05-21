/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronousqueue;

import java.util.concurrent.SynchronousQueue;


public class JavaSynchronousQueueExample {

	public static void main(String args[]) {
		final SynchronousQueue queue = new SynchronousQueue();
		
		// start publisher thread
		new Thread(new QueueProducer(queue)).start();
		
		// start consumer thread
		new Thread(new QueueConsumer(queue)).start();
	
	}

}
