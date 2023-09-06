import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double a, b, c, discriminant, discriminantSqRoot, x1, x2, realPart, imaginaryPart;
		boolean doLoop = true;
		String answer;
		
		System.out.println("Quadratic Equation Solver");
		System.out.println( "\n");
		
		while (doLoop) {
		    System.out.print("RUN or STOP?: ");
		    answer = inp.nextLine();
		    
		    if (answer.equals ("RUN")) {
		        
		        System.out.print("\nEnter value of a: ");
		        a = inp.nextDouble();
		        System.out.print("Enter value of b: ");
		        b = inp.nextDouble();
		        System.out.print("Enter value of c: ");
		        c = inp.nextDouble();
		        
		        discriminant = b * b - (4 * a * c);
		        discriminantSqRoot = Math.sqrt(discriminant);
		        
		        if (discriminant > 0) {
		            x1 = (-b + discriminantSqRoot) / (2 * a);
		            x2 = (-b - discriminantSqRoot) / (2 * a);
		            
		            System.out.println("\nThe roots are real and different.");
		            System.out.println("The roots are " + x1 + " and " + x2  + "." +"\n");
		            inp.nextLine();
		        } else if (discriminant == 0) {
		            x1 = (-b + discriminantSqRoot) / (2 * a);
		            
		            System.out.println("\nThe roots are real and the same.");
		            System.out.println("x1 = x2, therfore, the root is " + x1 + "." + "\n");
		            inp.nextLine();
		        } else {
		            realPart = -b / (2 * a);
		            imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
		            System.out.println("\nThe roots are complex and different.");
		            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
		            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i" + "\n");
		            inp.nextLine();
		        }
		        
		    } else if (answer.equals("STOP")) {
		        System.out.println("Thank you for using our program." + "\nHave a good day!" + "\n");
		        break;
		    } else {
		        System.out.println("None of the choices. Please try again." + "\n");
		        continue;
		    }
		}
		inp.close();
	}
}