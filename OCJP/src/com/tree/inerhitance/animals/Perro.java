package com.tree.inerhitance.animals;

public class Perro extends Animal {
	public Perro(){
		super("Canino");
	}
	
	@Override
	public void hacerRuido(){
		System.out.println("Dog barking!!!");
	}
}
