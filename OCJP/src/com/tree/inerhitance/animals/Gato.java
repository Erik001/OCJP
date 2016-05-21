package com.tree.inerhitance.animals;

public class Gato extends Animal {

	public Gato() {
		super("Felino");
	}
	
	@Override
	public void hacerRuido(){
		System.out.println("Gato haciendo miauuu");
	}
}
