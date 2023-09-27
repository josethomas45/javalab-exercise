/**********************************************************
 * File        :  positiveornegative.java
 * Description :  To find a number is positive or negative
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  27/09/2023
 **********************************************************/

package javaLab2;

import java.util.Scanner;

public class positorneg {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("entered number is a positive number");
		}
		else {
			System.out.println("the entered number is negative");
		}
	}

}
 