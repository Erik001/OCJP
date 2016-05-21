/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Humberto
 */
public class ReentrantReadWriteLockExample {

    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

    private static String message = "";

    public static void main(String[] args) throws InterruptedException {
        Thread read1 = new Thread(new Read(), "Reader 1");
        Thread read2 = new Thread(new Read(), "Reader 2");
        Thread read3 = new Thread(new Read(), "Reader 3");
        Thread writter1 = new Thread(new WriteA(), "Writer 1");
        Thread writter2 = new Thread(new WriteB(), "Writer 2");
        /*Thread writter3 = new Thread(new WriteA(), "Writer 3");
        Thread writter4 = new Thread(new WriteB(), "Writer 4");
        Thread writter5 = new Thread(new WriteA(), "Writer 5");
        Thread writter6 = new Thread(new WriteB(), "Writer 6");*/

        read1.start();
        read2.start();
        read3.start();

        writter1.start();
        writter2.start();
        /*
        writter3.start();
        writter4.start();
        writter5.start();
        writter6.start();*/
    }

    static class Read implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                if (lock.isWriteLocked()) {
                    System.out.println("I'll take the lock from Write");
                }
                lock.readLock().lock();
                try {
                    System.out.println("ReadThread " + 
                            Thread.currentThread().getName() 
                            + " ---> Message is " + message);
                } finally {
                    lock.readLock().unlock();
                }
            }
        }
    }

    static class WriteA implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    lock.writeLock().lock();
                    System.out.println("WriteThread " 
                            + Thread.currentThread().
                                    getName()+"(a)");
                    message = message.concat("a");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                } finally {
                    lock.writeLock().unlock();
                }
            }
        }
    }

    static class WriteB implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    lock.writeLock().lock();
                    System.out.println("WriteThread " 
                            + Thread.currentThread().
                                    getName()+"(b)");
                    message = message.concat("b");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                } finally {
                    lock.writeLock().unlock();
                }
            }
        }
    }
}
