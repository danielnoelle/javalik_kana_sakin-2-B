import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] container = new int[3];
		boolean doLoop = true;
		String answer;
		
		System.out.println("Greatest Number");
		System.out.println("\n");
		
		while (doLoop) {
		    System.out.print("RUN or STOP?: ");
		    answer = scnr.nextLine();
		    
		    if (answer.equals ("RUN")) {
		        
		        System.out.print("\nEnter a number: ");
		        container[0] = scnr.nextInt();
		        System.out.print("Enter a second number: ");
		        container[1] = scnr.nextInt();
		        System.out.print("Enter a third number: ");
		        container[2] = scnr.nextInt();
		        
		        Arrays.sort(container);
		        
		        System.out.println("\nThe greatest number is: " + container[2] + "\n");
		        scnr.nextLine();  
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