import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.math.RoundingMode;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		NumberFormat format = new DecimalFormat("#0.000");
		double num1, num2;
		boolean doLoop = true;
		String answer;
		
		System.out.println("Floating-Point Number Comparator");
		System.out.println("\n");
		
		while (doLoop) {
		    
		    System.out.print("RUN or STOP?: ");
		    answer = scnr.nextLine();
		     if (answer.equals ("RUN")) {
		        
		         try {
		            System.out.print("\nEnter a floating-point number: ");
		            num1 = scnr.nextDouble();
		            System.out.print("Enter another floating-point number: ");
		            num2 = scnr.nextDouble();
		            
		        } catch (InputMismatchException e) {
		            System.out.println("\nThat is not a number.");
		            scnr.nextLine();
		            System.out.println("Please try again." + "\n");
		            continue;
		        }
		        
		        String newNum1 = format.format(num1);
		        String newNum2 = format.format(num2);
		        
		        if (newNum1.equals(newNum2) && newNum2.equals(newNum1)) {
		                 
		            System.out.println("\nFirst floating-point value: " + newNum1);
		            System.out.println("Second floating-point value: " + newNum2);
		            System.out.println("The numbers are the same." + "\n");
		            scnr.nextLine();
		            
		        } else {
		               
		            System.out.println("\nFirst floating-point value: " + newNum1);
		            System.out.println("Second floating-point value: " + newNum2);
		            System.out.println("The numbers are different from each other." + "\n");
		            scnr.nextLine();
		            
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