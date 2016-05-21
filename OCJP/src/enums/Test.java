package enums;

import java.util.ArrayList;

public class Test {

	static public void main(String[] args) {
		ArrayList<Tester> vehicles = new ArrayList<>();
		Test temp = new Test();
		temp.fillArray(vehicles);
		
		for(Tester t : vehicles){
			t.print();
		}

	}

	private void fillArray(ArrayList a1) {
		Tester test = new Tester(Tester.Vehicle.Car, Tester.Make.BrandA);
		a1.add(test);
		test = new Tester(Tester.Vehicle.Motorcycle, Tester.Make.BrandB);
		a1.add(test);
		test = new Tester(Tester.Vehicle.Truck, Tester.Make.BrandC);
		a1.add(test);
		test = new Tester(Tester.Vehicle.Motorcycle, Tester.Make.BrandD);
		a1.add(test);
	}

}

class Tester {
	static enum Vehicle {
		Car, Truck, Motorcycle
	}

	static enum Make {
		BrandA, BrandB, BrandC, BrandD, BrandE
	}

	private final Make make;
	private final Vehicle vehicle;

	public Tester(Vehicle vehicle, Make make) {
		this.make = make;
		this.vehicle = vehicle;
	}
	
	public void print(){
		System.out.println(this.make + " " + this.vehicle);
	}

}
