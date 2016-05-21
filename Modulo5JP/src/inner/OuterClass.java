package inner;

public class OuterClass {
	private int x = 10;
	
	public void metodo(){
		System.out.println(this.x);
	}
	
	class InnerClass{ //No puede tener definiciones estaticas. Solo variables si son estaticas y finales
		static final int x = 30;
		
		public InnerClass(){
			System.out.println("x: " + this.x);
			System.out.println("x clase externa: " + OuterClass.this.x);
		}
		
		public int getX(){
			return x;
		}
	}
	
	public OuterClass() {
		// TODO Auto-generated constructor stub
	}

}

class TestInner{
	public static void main(String ... args){
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass inner = outerClass.new InnerClass();
		
		OuterClass.InnerClass in = new OuterClass().new InnerClass();
	}
}