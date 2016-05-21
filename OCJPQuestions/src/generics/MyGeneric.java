package generics;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric<Ti, No> {
	Ti ti;
	No no;

	public void set(Ti newTi, No newNo) {
		this.ti = newTi;
		no = newNo;
	}

	public List<Ti> getList() {
		List output = new ArrayList<Ti>();
		output.add(ti);
		output.add(no);
		return output;
	}
	
	public List<No> decList(){
		List output = new ArrayList<No>();
		if (no instanceof Number){
			float a = ((Number)no).floatValue();
			output.add(a--);
		}
		return output;
	}
}
