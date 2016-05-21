/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListRunnable implements Runnable {

    final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

    public ArrayListRunnable() {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    @Override
    public void run() {
        while (!list.isEmpty()) {
            System.out.println(Thread.currentThread().
                    getName() +" : " +list.remove(0));

        }
    }

    public static void main(String[] args) {
        ArrayListRunnable alr = new ArrayListRunnable();
        Thread t1 = new Thread(alr,"T1");
        Thread t2 = new Thread(alr,"T2");
        t2.start();
        t1.start();
    }
}
