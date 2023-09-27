/**********************************************************
 * File        :  week.java
 * Description :  To find the the day
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  27/09/2023
 **********************************************************/
package javaLab2;

import java.util.Scanner;

public class week {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		switch(num){
		
		case 1:{
			System.out.println("Sunday");
			break;
		}
		case 2:{
			System.out.println("Monday");
			break;
		}
		case 3:{
			System.out.println("Tuesday");
			break;
		}
		case 4:{
			System.out.println("Wednesday");
			break;
		}
		case 5:{
			System.out.println("Thursday");
			break;
		}
		case 6:{
			System.out.println("Friday");
			break;
		}
		case 7:{
			System.out.println("Saturday");
			break;
		}
		default:{
			System.out.println("Invalid input");
			break;
		}
		
		}
		
	}

}
