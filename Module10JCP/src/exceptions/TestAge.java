package exceptions;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame la edad");
		int age = scanner.nextInt();
		try{
		new TestAge().verify(age);
		}catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

	}
	
	void verify(int age){
		if(age < 12){
			throw new InvalidAgeException("Categoría Invalida"); //no need to handle because it is a RuntimeException
		}else if(age >= 12 & age <= 60){
			System.out.println("General Category");
		}else
			System.out.println("Senior Category");
	}

}
