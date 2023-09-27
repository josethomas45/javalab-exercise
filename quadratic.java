/**********************************************************
 * File        :  quadratic.java
 * Description :  To find a quadratic
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  27/09/2023
 **********************************************************/
package javaLab2;

import java.util.Scanner;

public class quadratic {
	
	public static void main(String[] args) {
		
		double a,b,c,result,res1,res2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		a=sc.nextDouble();
		System.out.println("Enter the second number:");
		b=sc.nextDouble();
		System.out.println("Enter the third number");
		c=sc.nextDouble();
		 
		result=b*b-4*a*c;
		
		if(result>0.0) {
			res1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			res2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
             System.out.println("The roots are " + res1 + " and " + res2);
         } else if (result == 0.0) {
             res1 = -b / (2.0 * a);
             System.out.println("The root is " + res1);
         } else {
             System.out.println("The equation has no real roots.");
         }
		}
		
		
	}

