package A;

public class Plant {

	String growthDirection(){
		return "down";
	}

}

class Embroyophyta extends Plant{
	String growthDirection(){
		return "up";
	}
}

class Garden{
	public static void main(String[] args){
		Embroyophyta e = new Embroyophyta();
		Plant c = new Embroyophyta();
		System.out.println(e.growthDirection() + c.growthDirection());
	}
}
