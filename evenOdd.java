import java.util.Scanner;
public class evenOdd {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your Number");
		
		int num=sc.nextInt();
		
		if (num % 2==0) {
			System.out.println("Given number is an Even number");	
		}
		
		else {
			System.out.println("Given number is  an odd number");
		}
		
	}

}
