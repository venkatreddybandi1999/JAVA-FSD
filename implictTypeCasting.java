package typeCasting;

public class implictTypeCasting {
	public static void main (String[] agrs) {
		
		
		byte a=10;
		System.out.println("a");
		
		short b=a;
		System.out.println("byte to short: "+b);
		
		int c=b;
		System.out.println("byte to short: "+b);
		
		int d=a;
		System.out.println("byte to int: "+d);
		
		float e=c;
		System.out.println("int to float: "+e);
		
		double f=e;
		System.out.println("float to double: "+f);
	}
}
