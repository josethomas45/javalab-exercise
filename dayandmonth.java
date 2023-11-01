import java.util.Scanner;

public class dayandmonth {

	public static void main(String[] String) {
		
		Scanner sc=new Scanner(System.in);
		
		int numberOfDaysInMonth=0;
		String MonthName="";
		
		System.out.println("Enter the month number:\t");
		int num=sc.nextInt();
		
		System.out.println("Enter the year:\t");
		int yr=sc.nextInt();
		
		switch(num) {
		
		case 1:
			MonthName="January";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 2:
			MonthName="February";
			if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
                numberOfDaysInMonth = 29;
            } else {
                numberOfDaysInMonth = 28;
            }
		    break;
		    
		case 3:
			MonthName="March";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 4:
			MonthName="April";
		    numberOfDaysInMonth=30;
		    break;
		    
		case 5:
			MonthName="May";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 6:
			MonthName="June";
		    numberOfDaysInMonth=30;
		    break;
		    
		case 7:
			MonthName="July";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 8:
			MonthName="August";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 9:
			MonthName="September";
		    numberOfDaysInMonth=30;
		    break;
		    
		case 10:
			MonthName="October";
		    numberOfDaysInMonth=31;
		    break;
		    
		case 11:
			MonthName="November";
		    numberOfDaysInMonth=30;
		    break;
		    
		case 12:
			MonthName="December";
		    numberOfDaysInMonth=31;
		    break;
		
		}
		
		System.out.println(MonthName+" "+yr+" has "+numberOfDaysInMonth+" days\n");
		
	}
}
