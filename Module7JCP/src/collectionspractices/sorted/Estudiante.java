package collectionspractices.sorted;

public class Estudiante implements Comparable{
	private String name;
	private String apellido;
	private int id;
	public Estudiante(String name, String apellido, int id) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Object o) {
		Estudiante e = (Estudiante) o;
		if(this.id == e.id){
			return 0;
		}else if(this.id < e.id){
			return -1;
		}else{
			return 1;
		}
	}
	
	
	@Override
	public String toString(){
		return id + " " + name + " " + apellido;
	}
	
	
}
