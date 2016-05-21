package com.tree.inerhitance.animals;

public class Leon extends Animal {

	public Leon() {
		super("Felino");
	}

	@Override
	public void hacerRuido() {
		System.out.println("Leon haciendo grrrrr");
	}
}
