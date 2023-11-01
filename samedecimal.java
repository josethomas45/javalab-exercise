import java.util.Scanner;

public class samedecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first decimal number:\n");
		double x=sc.nextDouble();
		
		System.out.println("Enter the second decimal number:\n");
		double y=sc.nextDouble();
		
		x=Math.round(x*1000);
		x=x/1000;
		
		y=Math.round(y*1000);
		y=y/1000;
		
		if(x==y) {
			System.out.println("Entered numbers are same.");
		}
		else {
			System.out.println("Entered numbers are different.");
		}
	}
}
