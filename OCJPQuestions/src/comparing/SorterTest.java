package comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SorterTest {

	public static void main(String[] args) {
		int[] intArr = new int[]{ 26, 2, 5, 8, 19, 34, 17, 9, 15, 29 };
		List intList = Arrays.asList(26, 2, 5, 8, 19, 34, 17, 9, 15, 29);
		//List intList = Arrays.asList(intArr);
		

		for (int i = 0; i < intArr.length; i++){
			if(i == 0)
				System.out.print("[");
			System.out.printf(intArr[i] + "" + ((i < intArr.length - 1) ? ", " : "]%n"));
			
		}
			
		System.out.println("***************************************************");

		System.out.println(intList);
		
		System.out.println("***************************************************");
		
		//Arrays.sort(intArr);
		int positionArray = Arrays.binarySearch(intArr, 17);
		
		//Collections.sort(intList);
		int positionList = Collections.binarySearch(intList, 17);
		
		
		for (int i = 0; i < intArr.length; i++){
			if(i == 0)
				System.out.print("[");
			System.out.printf(intArr[i] + "" + ((i < intArr.length - 1) ? ", " : "]%n"));
			
		}
		System.out.println("Posición de 17 en el Arreglo es: " + positionArray);
			
		System.out.println("***************************************************");

		System.out.println(intList);
		
		System.out.println("Posición de 17 en la Lista: " + positionList);

	}

}
