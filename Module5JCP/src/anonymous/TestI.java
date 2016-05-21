package anonymous;

public class TestI {
	Integer x;
	
	public static void main(String[] args) {
		new TestI().go(5);
	}

	void go(int i) {
		System.out.println(x+ ++i);
		
	}

}
