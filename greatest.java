/**********************************************************
 * File        :  greatest.java
 * Description :  To find the greatest number
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  27/09/2023
 **********************************************************/
package javaLab2;

import java.util.Scanner;

public class greatest {
	
	public static void main(String[] args) {
		
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=sc.nextFloat();
		System.out.println("enter he second number");
		b=sc.nextFloat();
		System.out.println("Enter the third number");
		c=sc.nextFloat();
		
		if(a>b&&a>c) {
			System.out.println("Greatest = "+a);
		}
		else if(b>c) {
			System.out.println("Greatest = "+b);
		}
		else {
			System.out.println("Greatest = "+c);
		}
		
	}

}
