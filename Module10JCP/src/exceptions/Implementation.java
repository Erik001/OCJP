package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

interface xyz{
	void abc() throws IOException;
}

interface pqr{
	void abc() throws FileNotFoundException;
}

public class Implementation implements xyz, pqr {

	@Override
	public void abc() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
