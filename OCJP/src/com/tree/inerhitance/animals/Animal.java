package com.tree.inerhitance.animals;

public class Animal {
		private String especie;
		
		public Animal(String especie){
			this.especie = especie;
		}
		
		
		
		public String getEspecie() {
			return especie;
		}



		public void hacerRuido(){
			System.out.println("Animale making some noise");
		}
}
