package assertions.invariant;

public class TestInvariant {

	public static void main(String[] args) {
		int x = -6;
		if(x >0){
			System.out.println("x>0");
		}else{
			assert x==0 : "x es diferente de 0";
			System.out.println("x==0");
		}

	}

}
