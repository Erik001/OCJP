package exceptions;

public class Test3 {
	void display(String arr[]){
		try{
			System.out.println(arr[2]);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e){
			//e = new Exception(); //BAD cannot convert from Exception to RuntimeException
			throw e;
		}
	}
	public static void main(String[] args) {
		try{
			String[] arr = {"Unix", "Solaris", null};
			new Test3().display(arr);
		}catch(Exception e){
			System.err.println(e.getClass());
		}

	}

}
