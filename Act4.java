import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double num, million = 1000000.0, negativeMillion = -1000000.0;
		boolean doLoop = true;
		String answer;
		
		System.out.println("Greatest Number");
		System.out.println("\n");
		
		while (doLoop) {
		    System.out.print("RUN or STOP?: ");
		    answer = scnr.nextLine();
		    
		    if (answer.equals ("RUN")) {
		        
		        System.out.print("\nEnter a number: ");
		        num = scnr.nextDouble();
		        
		        if (num < 1 && num > 0) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a positive small number." + "\n");
		            scnr.nextLine();
		            
		        }  else if (num > -1 && num < 0) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a negative small number." + "\n");
		            scnr.nextLine();
		            
		        } else if (num == 0) {
		            
		            int result = (int) num;
		            System.out.println("\nInput value: " + result);
		            System.out.println("It is zero." + "\n");
		            scnr.nextLine();
		            
		        } else if (num > 0 && million > num) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a positive number." + "\n");
		            scnr.nextLine();
		            
		        } else if (num > 0 && million < num) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a positive large number." + "\n");
		            scnr.nextLine();
		            
		        } else if (num < 0 && negativeMillion < num) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a negative number." + "\n");
		            scnr.nextLine();
		            
		        }  else if (num < 0 && negativeMillion > num) {
		            
		            System.out.println("\nInput value: " + num);
		            System.out.println("It is a negative large number." + "\n");
		            scnr.nextLine();
		            
		        }  
		    } else if (answer.equals("STOP")) {
		        System.out.println("\nThank you for using our program." + "\nHave a good day!" + "\n");
		        break;
		    } else {
		        System.out.println("None of the choices. Please try again." + "\n");
		        continue;
		    }
		}
		scnr.close();
	}
}