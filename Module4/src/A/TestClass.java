package A;

import java.util.*;
import java.util.regex.*;

public class TestClass {

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i = 1;
		int[] iArr = {1};
		incr(i);
		incr(iArr);
		System.out.println("i = " + i +" iArr[0] = " + iArr[0]);
	}

	public static void incr(int i) {
		i++;
		
	}

	public static void incr(int[] iArr) {
		iArr[0]++;
		
	}

}

