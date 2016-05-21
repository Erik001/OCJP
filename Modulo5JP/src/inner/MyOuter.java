package inner;

public class MyOuter {

	public MyOuter() {
		// TODO Auto-generated constructor stub
	}
	
	private void externalMethod(){
		System.out.println("metodo externo: ");
	}
	
	class MyInner{
		public void internalMethod(){
			MyOuter.this.externalMethod();
			System.out.println("metodo Interno: ");
		}
	}

}

class TestMyOuter{
	public static void main(String ... ar){
		MyOuter mo = new MyOuter();
		MyOuter.MyInner mi = mo.new MyInner();
		mi.internalMethod();
	}
}
