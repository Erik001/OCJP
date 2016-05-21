/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoin;

import java.util.concurrent.Phaser;

/**
 *
 * @author JRobles
 */
public class PhaserTest {

    public static void main(String... args) {
        final Phaser p = new Phaser(3);
       // final Phaser p = new Phaser(4);
        new Thread() {
            public void run() {
                String tname = Thread.currentThread().getName();
                System.out.println(tname + ":about to wait");
                p.arriveAndAwaitAdvance();
                System.out.println(tname + ":done waiting");
            }
        }.start();
        new Thread() {
            public void run() {
                String tname = Thread.currentThread().getName();
                System.out.println(tname + ":about to wait");
                p.arriveAndAwaitAdvance();
                System.out.println(tname + ":done waiting");
            }
        }.start();
        p.arriveAndDeregister();
    }
}
