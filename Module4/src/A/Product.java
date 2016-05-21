package A;

public class Product {

	private int id;
	
	public Product(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode(){
		return id + 42;
	}
	
	@Override
	public boolean equals(Object obj){
		return (this == obj)? true : super.equals(obj);
	}

}

class WareHose{
	public static void main(String[] args){
		Product p1 = new Product(10);
		Product p2 = new Product(10);
		Product p3 = new Product(20);
		System.out.print(p1.equals(p2) + " ");
		System.out.println(p1.equals(p3));
	}
}
