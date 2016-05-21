package anonymous;

public class Plant {
	static volatile int sa;
	
	//abstract String growthDirection(); BAD
	public enum Direction{
		NORTH, EAST, SOUTH, WEST;
		
		//public Direction(){ only private or no modifier is permitted
		private Direction(){
		}
		
		public int a;
		
		public void getThere(){
			
		}
	}
	
	public static void main(String [] args){
		for(Direction d: Direction.values()){
			System.out.println(d);
		}
	}
}


