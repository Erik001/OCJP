package abstracto;

public class Santo {

	public Santo() {
	
	}
	
	public void mataMarciano(){
		if(statics.Marciano.cuentaMarciano > 0){
			statics.Marciano.cuentaMarciano--;
			System.out.print("Santo : mato un marciano, ");
		}
		
		System.out.println(" quedan : " + statics.Marciano.cuentaMarciano);
	}

}
