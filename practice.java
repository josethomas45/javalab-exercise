package javaproj1;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int j=0;
		
		System.out.println("Enter the string to be reversed");
		String name=sc.next();
		
		char []a=name.toCharArray();
		char[]b=new char[30];
		int length=name.length();
		
		for(int i=0; i<length;i++) {
			
			b[j]=a[length-i-1];
			j++;
			
		}
		
		for(int i=0;i<length;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
