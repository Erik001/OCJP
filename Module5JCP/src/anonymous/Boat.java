package anonymous;

public abstract class Boat {
	String doFloat(){return "floating";}
	abstract void doDock();
}


class Sailboat extends Boat{
	public static void main(String...arg){
		Boat b = new Sailboat();
		//Boat b2 = new Boat();
		/*Boat b2 = new Boat() {
			
			@Override
			void doDock() {
				// TODO Auto-generated method stub
				
			}
		};*/
	}
	
	String doFloat(){return "slow float";}
	
	@Override
	void doDock() {
		// TODO Auto-generated method stub
		
	}
	
}
