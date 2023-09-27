/**********************************************************
 * File        :  floatingfloatingpoint.java
 * Description :  to assign floating
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  27/09/2023
 **********************************************************/
package javaLab2;

import java.util.Scanner;

public class floatingfloatingpoint {
	
	public static void main(String[] args) {
		
		float num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to be checked");
		num=sc.nextFloat();
		
		if(num>0) {
			if(num<1) {
				System.out.println("Entered number is a positive small");
			}
			else if(num>1000000) {
				System.out.println("Enetered number is positive large");
			}
			else {
				System.out.println("Entered number is positive");
			}
		}
		else {
			System.out.println("Entered number is negative");
		}
			
		
	}

}
