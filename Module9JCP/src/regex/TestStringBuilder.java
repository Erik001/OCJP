package regex;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("123456789");
		StringBuilder sb2 = sb;
		
		sb.delete(2, 3);
		sb.append("abc");
		sb2.reverse();
		StringBuilder sb3 = new StringBuilder("cba98765421");
		if(sb == sb2)System.out.println("print 1");
		if(sb.equals(sb2))System.out.println("print 2");
		if(sb.equals(sb3))System.out.println("print 3");
		System.out.println(sb + " --- " + sb3);
		

	}

}
