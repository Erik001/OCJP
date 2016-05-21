package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * DeadLock.java
 * 
 * Creada el 8/11/2014, 01:45:23 PM
 * 
 * Clase Java desarrollada por Juan Robles para la empresa Develop el día 8/11/2014
 * 
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * jrobles@7i.com.mx
 */
/**
 * 
 * @author Juan Robles
 * @version 1.0
 * @author-mail jrobles@7i.com.mx
 * @creation-date 8/11/2014
 */
public class DeadLock implements Runnable {

	A a = new A();
	B b = new B();

	public DeadLock() {
		Thread t = new Thread(this, "Mi hilo");
		t.start();
		a.foo(b);
		System.out.println("Regreso a mi hilo principal");
	}

	@Override
	public void run() {
		b.bar(a);
		System.out.println("Regreso al otro Hilo");
	}

	public static void main(String[] args) {
		new DeadLock();
	}

}


class A {

	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entro an A.foo()");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ex)
		{
			Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println(name + " intentando llamar a B.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Dentro de A.last()");
	}
}


class B {

	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entro en B.bar()");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException ex)
		{
			Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
		}

		System.out.println(name + " intentando llamar a A.last()");
		a.last();

	}

	synchronized void last() {
		System.out.println(" Dentro de B.last()");
	}
}
