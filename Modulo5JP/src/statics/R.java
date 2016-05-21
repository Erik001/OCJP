package statics;

public class R {
	
	protected static int var = 90;
	private int varInstancia = 100;
	
	//public String ride(){
		public  static String ride(){
		//this.var = 50; bad
		return "riding";
	}
	public R() {
		// TODO Auto-generated constructor stub
	}

}

class H extends R{
	static {
	int x = 1;
	}
	public static String ride(){
		//x = 2;
		//super.var = 90; bad
		return "cantering";
	}
}

///Invocación virtual, pasa cuando se tienen instancias y los metodos pertenecen a las instancias
class Test{
	public static void main(String...argy){
		System.out.println(R.var);
		R r = new  R();
		System.out.println(r.var); //not recommended
		R h = new  H();
		System.out.println(h.var); //not recommended
		System.out.println("************************************");
		System.out.println(r.ride());
		System.out.println(h.ride());
	}
}