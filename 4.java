import java.util.Scanner;
public class exer4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String name, foi;
		int rollNum;
			
			System.out.print("Enter your name: ");
			name = scnr.nextLine();
			System.out.print("Enter your roll number: ");
			rollNum = scnr.nextInt();
			scnr.nextLine();
			System.out.print("Enter your field of interest: ");
			foi = scnr.nextLine();
			scnr.close();
			
			System.out.println("\n" + "Hey, my name is " + name + " and my roll number is " + rollNum + ". My field of interest are " + foi + ".");
	}

}
est are " + foi + ".");
	}

}
