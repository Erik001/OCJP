package com.tree.practices.primitives;

public class TestOverflow {

	public static void main(String[] args) {
		int a = 1_000_000_000, b = 2_000_000_000;
		long result = a + (long)b;
		System.out.println("Overflow while adding two ints: " + (a + b));
		System.out.println("Overflow while adding two ints: " + result);
	}

}
