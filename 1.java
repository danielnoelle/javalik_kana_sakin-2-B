import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2;
			
			System.out.print("Enter an integer: ");
			num1 = scnr.nextInt();
			System.out.print("Enter another integer: ");
			num2 = scnr.nextInt();
			System.out.print("\n" + num1 + " + " + num2 + " = ");
			System.out.println(num1 + num2);

    }

}
