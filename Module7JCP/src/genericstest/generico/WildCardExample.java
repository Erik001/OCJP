package genericstest.generico;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
	public static void main(String[] args){
		List<Employee> employees = new ArrayList<>();//Los tipos son invariantes, no se pueden cambiar
		//List<Employee> employees2 = new ArrayList<Manager>();//BAD no se puede cambiar de tipo
		List<Manager> managers = new ArrayList<Manager>();
		List<Director> directores = new ArrayList<Director>();
		List<Employee> employees3 = new ArrayList<Employee>();
		List lista = new ArrayList();
		//invariante
		//employees = directores; BAD
		employees = employees3;
		lista = employees;//puede tener un heappollution classcastexception
		//Si ocupamos el comodin ? extends Clase -- Solo lectura, no permite agregar, add, remove
		//Covariante
		List<? extends Employee> list;
		list = employees;
		list = managers;
		list = directores;
		
		List<? super Manager> list2;
		list2 = employees;
		list2.add(new Manager());
		//list2.add(new Employee()); BAD
		list2.add(new Director());
		
		//list.add(new Director()); BAD
		
	}
}

class Employee{}

class Manager extends Employee{}

class Director extends Manager{}

