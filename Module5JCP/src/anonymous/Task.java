package anonymous;

public class Task {
	String title;
	static class Counter{
		int counter = 0;
		
		void increment(){
			counter++;
		}
	}
	
	public static void main(String[] arg){
		new Task.Counter().increment();
	}
}
