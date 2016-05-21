package genericstest.generico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VarArgs {
	//@SafeVarargs
	@SuppressWarnings({"unchecked","varargs"})//no estaticos ni finales
	//Elimina los warnings
	//static final<T extends Serializable> List asList(T...elements){
	//<T extends Serializable> List asList(T...elements){
	<T> List asList(T...elements){
		List<T> lista = new ArrayList<>();
		for(T aux: elements){
			lista.add(aux);
		}
		return lista;
	}
	
	public static void main(String...args){
		VarArgs varargs = new VarArgs();
		List<Integer> list = varargs.<Integer>asList(1,2,3,4);
		for(Integer list1: list){
			System.out.println(list1);
		}
	}
}
