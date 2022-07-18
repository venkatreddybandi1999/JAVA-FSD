import java.util.Scanner;
public class nestedIf {
	public static void main (String[]args) {
	
	Scanner sc=new Scanner (System.in);
	int age;
	int weight;
	System.out.println("Enter your Age");
	age=sc.nextInt();
	System.out.println("Enter your Weight to check for eligibility");
	weight=sc.nextInt();
	if (age > 18) {
		if (weight > 50) {
			System.out.println("You are eligible for to donate blood");
		}
	}

	}

}
