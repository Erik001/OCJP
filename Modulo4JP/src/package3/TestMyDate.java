package package3;

public class TestMyDate {

	public static void main(String...af){
		MyDate m1 = new MyDate(6,2,2016);
		MyDate m2 = new MyDate(6,3,2016);
		MyDate m3 = m1;
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);
		System.out.println("*********equals********");
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(new Object()));
	}

}
