import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static boolean isLeapYear(int year) {
	    if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            if (year % 400 == 0) {
	                return true;
	            } else {
	                return false;
	            }
	        } else {
	            return true;
	        }
	    } else {
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		boolean doLoop = true;
		String answer;
		
		System.out.println("Leap Year?");
		System.out.println("\n");
		
		while (doLoop) {
		    
		    System.out.print("RUN or STOP?: ");
		    answer = scnr.nextLine();
		    
		    if (answer.equals ("RUN")) {
		            
		            try {
		                System.out.print("\nEnter a year: ");
		                num = scnr.nextInt();
		                
		                if (isLeapYear(num) == true) {
		                    System.out.println("\n" + num + " is a leap year." + "\n");
		                    scnr.nextLine();
		                } else {
		                    System.out.println("\n" + num + " is not a leap year." + "\n");
		                    scnr.nextLine();
		                }
		                
		            } catch (InputMismatchException e) {
		            System.out.println("\nThat is not a number.");
		            scnr.nextLine();
		            System.out.println("Please try again." + "\n");
		            continue;
		            }
		   } else if (answer.equals("STOP")) {
		        
		        System.out.println("Thank you for using our program." + "\nHave a good day!" + "\n");
		        break;
		        
		    } else {
		        
		        System.out.println("None of the choices. Please try again." + "\n");
		        continue;
		        
		    }
		}
		scnr.close();
	}
}