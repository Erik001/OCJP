package regex;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sd1 = new StringBuilder("String Builder");
		String str5 = new String(sd1);
		StringBuffer sb2 = new StringBuffer("String Buffer");
		
		String str6 = new String(sb2);
		
		System.out.println(sd1.equals(str5));
		//System.out.println(sd1 == str5);
		System.out.println(sb2.equals(str6));

	}

}
