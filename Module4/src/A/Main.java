package A;

public class Main {

	public Main() {
		// int a,b,c = 100; OK
		// int a, b, c ; a = b = c = 100; OK
		// int a = 100 = b = c; BAD
		// int a = 100, b, c; OK
		// int a = b = c = 100;
	}

	public static void main(String... args) {
		int[][] twoD = {{1,2,3},{4,5,6,7},{8,9,10}};
		System.out.println(twoD[1].length);
		System.out.println(twoD[2].getClass().isArray());
		System.out.println(twoD[1][2]);
		Vehicle v = new SportsCar();
		System.out.println(v.goes());
		Tank t = (Tank) v;
		System.out.println(t);
	}

}

class Vehicle {
	public String goes() {
		return "goes";
	}
}

class SportsCar extends Vehicle {
	public String goes() {
		return "fast";
	}
}

class Tank extends Vehicle {
	public String goes() {
		return "slow";
	}
}
