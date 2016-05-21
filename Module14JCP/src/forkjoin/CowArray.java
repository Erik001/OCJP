/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoin;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CowArray extends Thread {

    static List<Integer> myList = new CopyOnWriteArrayList<Integer>();

    public static void main(String[] args) {
        myList.add(11);
        myList.add(22);
        myList.add(33);
        myList.add(44);
        new CowArray().start();
        for (Integer i : myList) {
            System.out.println("comenzando");
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println("e1");
            }
            System.out.print(" " + i);
        }
    }

    public void run() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.print("e2");
        }
        myList.add(77);
        System.out.print("size: " + myList.size() + ", elements: \n");
    }
}
