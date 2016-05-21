package assertions;

import assertions.flow.TestAssertFlowInvariant;
import assertions.invariant.TestInvariant;

public class TestAssert2 {

	public static void main(String[] args) {
		TestAssertFlowInvariant.main(args);
		System.out.println("*******************************");
		TestInvariant.main(args);
		

	}

}
