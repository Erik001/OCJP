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
public class IncrementorTwo {

    public static void main(String[] args) {
        AtomicInteger[] var = new AtomicInteger[5];
        for (int r = 0; r < 5; r++) {
            var[r] = new AtomicInteger();
        }
        System.out.println("");
        for (int r = 0; r < var.length; r++) {
            var[r].incrementAndGet();
            if (r == 2) {
                var[r].compareAndSet(2, 4);
            }
            System.out.print(var[r] + " ");
        }
    }
}
