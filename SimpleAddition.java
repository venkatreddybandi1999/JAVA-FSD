import java.util.Scanner;
public class SimpleAddition {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int num1,num2, result;
		System.out.println("Enter fisrt number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
	    result = num1+num2 ;
		System.out.println("Addition is "+result);
		
	}
}
