package serialisacion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//public class Dog extends Animal implements Serializable { //solo serializa los valores del padre cvomo estan definidos
public class Dog extends Animal  {
	//private transient Collar theCollar; no serialisa
	private static Collar theCollar; //no serialisa
	//private Collar theCollar;
	private int dogSize;
	
	public Dog(Collar theCollar, int dogSize) {
		super();
		this.theCollar = theCollar;
		this.dogSize = dogSize;
	}

	public Collar getTheCollar() {
		return theCollar;
	}

	public void setTheCollar(Collar theCollar) {
		this.theCollar = theCollar;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException{ //Deben ser privados y solo así puede serializar elmentos que no se serializan
		try {
			os.writeInt(theCollar.getCollarSize());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream oi) throws IOException, ClassNotFoundException{
		try{
			theCollar = new Collar(oi.readInt());
		}catch(IOException  e){
			e.printStackTrace();
		}
	}
	
	
}
