import java.util.Scanner;
public class exer2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2, sum, product;
			
			System.out.print("Enter an integer: ");
			num1 = scnr.nextInt();
			System.out.print("Enter another integer: ");
			num2 = scnr.nextInt();
			sum = num1 + num2;
			product = num1 * num2;
			
			System.out.print("\n" + "Sum: " + sum + "\n" + "Product: " + product + "\n" + "\n");

	}

}

