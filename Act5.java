import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		boolean doLoop = true;
		String answer;
		
		System.out.println("Seven Days a Week");
		System.out.println("\n");
		
		while (doLoop) {
		    
		    System.out.print("RUN or STOP?: ");
		    answer = scnr.nextLine();
		    
		    if (answer.equals ("RUN")) {
		        
		         try {
		            System.out.print("\nEnter an integer between 1 - 7: ");
		            num = scnr.nextInt();
		        } catch (InputMismatchException e) {
		            System.out.println("\nThat is not an integer.");
		            scnr.nextLine();
		            System.out.println("Please try again." + "\n");
		            continue;
		        }
		        
		        switch(num) {
		            
		            case 1:
		                System.out.println("\nThe day is Monday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 2:
		                System.out.println("\nThe day is Tuesday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 3:
		                System.out.println("\nThe day is Wednesday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 4:
		                System.out.println("\nThe day is Thursday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 5:
		                System.out.println("\nThe day is Friday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 6:
		                System.out.println("\nThe day is Saturday." + "\n");
		                scnr.nextLine();  
		                break;
		            case 7:
		                System.out.println("\nThe day is Sunday." + "\n");
		                scnr.nextLine();  
		                break;
		            default:
		                System.out.println("\nThere are only 7 days in a week." + "\nPlease try again" + "\n");
		                scnr.nextLine();  
		                break;
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