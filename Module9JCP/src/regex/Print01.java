package regex;

public class Print01 {

	public static void main(String[] args) {
		double price = 24.99;
		int quantity = 2;
		String color = "Blue";
		
		String out = String.format("We have %03d %s pants that cost $%3.2f \n", quantity, color, price);
		System.out.println(out);
		
		System.out.printf("We have %03d %s pants that cost $%3.2f \n", quantity, color, price);

	}

}
