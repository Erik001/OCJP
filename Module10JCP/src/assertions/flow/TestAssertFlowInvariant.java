package assertions.flow;

public class TestAssertFlowInvariant {

	public static void main(String[] args) {
		new AssertionCase().flowInvariants();
		

	}

}

class AssertionCase {
	public void flowInvariants() {
		String[] args = { "SE", "ee", "ME" };
		for (String var : args) {
			switch (var) {
			case "EE":
				System.out.println("Enterprise Edition");
				break;
			case "SE":
				System.out.println("Standard Edition");
				break;
			case "ME":
				System.out.println("Micro Edition");
				break;
			default:
				assert false : "Debería ser EE";
				System.out.println("mensaje de error en la lógica");
			}

		}
	}
}
