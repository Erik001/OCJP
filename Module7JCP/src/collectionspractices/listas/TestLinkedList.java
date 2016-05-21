package collectionspractices.listas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		lista.add("Hola");
		lista.add(34);
		lista.add("saludo");
		LinkedList lista2 = new LinkedList();
		lista2.add("Hola");
		lista2.add(34);
		lista2.add("saludo");

		System.out.println(lista);
		System.out.println(lista.peek());
		System.out.println(lista.poll());
		System.out.println(lista);
		System.out.println(lista.poll());
		System.out.println(lista);
		System.out.println(lista.poll());
		System.out.println(lista);
		System.out.println(lista.poll());
		System.out.println(lista);
		System.out.println(lista.peek());

		System.out.println("****************************************************************");

		Iterator i = lista2.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("****************************************************************");

		ListIterator aux = lista2.listIterator(lista2.size());
		for(;aux.hasPrevious();){
			System.out.println(aux.previous());;
		}
		
		System.out.println("****************************************************************");
		
		while(aux.hasNext()){
			System.out.println(aux.next());
		}
	}

}
