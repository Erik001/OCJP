package exceptions;

public class TestException3 {

	public static void main(String[] args) {
		new TestException3().infected();
	}

	public void infected() {
		System.out.println("before");
		try {
			int i = 1 / 0;
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
			throw e;
		} finally {
			System.out.println("finally");
		}
		System.out.println("after");
	}

}
