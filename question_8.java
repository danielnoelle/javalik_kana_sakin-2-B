import java.util.Scanner;

public class question_8 {
    
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
		int inp1, inp2, inp3;
		
			
			System.out.print("Enter a number: ");
			inp1 = scnr.nextInt();
			System.out.print("Enter a number again: ");
			inp2 = scnr.nextInt();
			System.out.print("Enter a number one more time: ");
			inp3 = scnr.nextInt();
			
			if ((inp1 == inp2) && (inp1 == inp3) && (inp2 == inp3)) {
				System.out.println("\n" + "All are equal." + "\n");
			} else if ((inp1 == inp2) || (inp1 == inp3) || (inp2 == inp3)) {
				System.out.println("\n" + "Any of two are equal." + "\n");
			} else {
				System.out.println("\n" + "None are equal." + "\n");
			}


    }
}
