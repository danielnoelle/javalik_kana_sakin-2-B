import java.util.Scanner;
  
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inp_num, answer;
		boolean doLoop = true;
		
		System.out.println("Positive-Negative Detector");
		System.out.println("\n");
		
		while (doLoop) {
		    System.out.print("RUN or STOP?: ");
		    answer = scanner.nextLine();
		    
		    if (answer.equals("RUN")) {
		        System.out.print("Enter an integer: ");
		        inp_num = scanner.nextLine();
		        try {
		            if (Integer.parseInt(inp_num) > 0) {
			            System.out.println("It is a positive integer." + "\n");
		            } else if (Integer.parseInt(inp_num)  < 0) {
			            System.out.println("It is a negative integer." + "\n");
		           } else {
		                System.out.println("It is zero." + "\n");
		            }
		        } catch (NumberFormatException e) {
		            System.out.println("It is not an integer." + "\nPlease try again." + "\n");
		       }
		    } else if (answer.equals("STOP")) {
		        System.out.println("Thank you for using our program." + "\nHave a good day!" + "\n");
		        break;
		    } else {
		        System.out.println("None of the choices. Please try again." + "\n");
		        continue;
		    } 
		}
		scanner.close();
	}
}