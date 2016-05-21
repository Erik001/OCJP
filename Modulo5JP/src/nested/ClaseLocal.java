package nested;

public class ClaseLocal {
	char c = 'c';
	
	
	public ClaseLocal() {
		// TODO Auto-generated constructor stub
	}

	
	public class A{
		void innerMethod(){
			System.out.println("BBBBBBB");
		}
	}
	
	public void method(){
		final char d = 'd';
		class A{
			char e = 'e';
			public A(){
				System.out.println("d: " + d); ///en java 8 no necesita ser final
			}
			
			public void innerMethod(){
				System.out.println("A: " + c + d);
			}
		}///Final clase A
		A a = new A();
		a.innerMethod();
		ClaseLocal.A a2 = new ClaseLocal.A();
		a2.innerMethod();
	}

}

class App2{
	public static void main(String[] args){
		ClaseLocal cl = new ClaseLocal();
		cl.method();
	}
}