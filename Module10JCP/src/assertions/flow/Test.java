package assertions.flow;

public class Test {

	public static void main(String[] args) {
		String arg[] = { "SE", "ee", "ME" };
		for (String var : arg) {
			try {
				switch (var) {
				case "SE":
					System.out.println("Standard Edition");
					break;
				case "EE":
					System.out.println("Enterprise Edition");
					break;
				case "ME":
					System.out.println("Micro Edition");
					break;
				default:
					assert false;

				}
			} catch (Throwable e) {
				System.out.println(e.getClass());
			}
		}

	}

}
