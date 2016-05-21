/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lock;

/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2015
 */

//deadlook
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockingDemo {

    final static Lock lock = new ReentrantLock();

    public static void main(final String... args) {
        new ReentrantLockingDemo().go();
    }

    private void go() {
        new Thread(newRunable(), "Thread1").start();
        new Thread(newRunable(), "Thread2").start();
    }

    private Runnable newRunable() {
        return new Runnable() {

            @Override
            public void run() {
                do {
                    try {
                        if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                            try {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println(Thread.currentThread().
                                            getName() + " tiene la llave [" + i + "] :)");
                                    Thread.sleep(1000);
                                }
                            } finally {
                                lock.unlock();
                                System.out.println(Thread.currentThread().getName() + " ha liberado la llave.");
                            }
                            break;
                        } else {
                            System.out.println(Thread.currentThread().getName() + " esperando la llave :(");
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                } while (true);
            }
        };
    }
}
