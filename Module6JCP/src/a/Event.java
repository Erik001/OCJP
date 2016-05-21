package a;

public interface Event {
	 abstract String getCategory();
}

class CueSports{
	public String getCategory(){
		return "Cue sports";
	}
}

class Snooker extends CueSports implements Event{
	public static void main(String[] args){
		Event obj1 = new Snooker();
		CueSports obj2 = new Snooker();
		System.out.println(obj1.getCategory() + "," + obj2.getCategory());
	}
}