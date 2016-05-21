package serialisacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializacion {

	public static void main(String args) {
		Collar c = new Collar(3);
		Dog dog1 = new Dog(c, 5);
		Dog dog2 = new Dog(c, 5);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSer.ser"));) {
			dog1.x = 27;
			oos.writeObject(dog1);
			dog1.x = 100;
			oos.writeObject(dog1);
			oos.writeObject(dog2);
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//Collar c = new Collar(777);
		//Dog dog1 = new Dog(c, 3);
		Dog dog1 = null;

		try (FileInputStream fis = new FileInputStream("testSer.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			while(fis.available() > 0){
				dog1 = (Dog)ois.readObject();
				System.out.println(dog1.x);
				System.out.println(dog1.getTheCollar());
			}
			
		} catch (IOException | ClassNotFoundException io) {
			io.printStackTrace();
		}
	}

}
