package com.tree.inerhitance.animals;

public class TestAnimal {
	public static void main (String...arg){
		Perro perro = new Perro();
		escucharAnimal(perro);
		Gato gato = new Gato();
		Leon leon = new Leon();
		escucharAnimal(gato);
		escucharAnimal(leon);
		Animal perron = new Perro();
		escucharAnimal(perron);
		
	}
	
	public static void escucharAnimal(Animal p){
		System.out.println("**************");
		if(p instanceof Object)
			System.out.println("p es un Object");
		if(p instanceof Animal)
			System.out.println("p es un Animal");
		if(p instanceof Perro)
			System.out.println("p es un Perro");
		p.hacerRuido();
		
	}
	
	
	public static void escucharAnimal(Perro p){
		p.hacerRuido();
	}
	

}
