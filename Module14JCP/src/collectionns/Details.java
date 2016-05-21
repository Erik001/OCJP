/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 31/10/2015
 */
public class Details {

    public static void main(String a[]) {
        List<String> syncal = new ArrayList<String>();

        //Adding elements to synchronized ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");

        System.out.println("Iterating synchronized ArrayList:");
        synchronized (syncal) {
            Iterator<String> iterator = syncal.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
