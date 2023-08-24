import java.util.Scanner;
public class exer3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double width, length, area;
		
			System.out.print("Enter the length of a rectangle: ");
			length = scnr.nextDouble();
			System.out.print("Enter the width of a rectangle: ");
			width = scnr.nextDouble();
			area = width * length;
			
			System.out.print("\n" + "The area of the rectangle is: " + (int) area + "\n" + "\n");
			
		}
}