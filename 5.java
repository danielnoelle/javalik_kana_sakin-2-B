import java.util.Scanner;
public class exer5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int side, area, perimeter;
			
			System.out.print("Enter a side of a square: ");
			side = scnr.nextInt();
			area = side * side;
			perimeter = side * 4;
			System.out.println("\n" + "Area: " + area);
			System.out.println("Perimeter: " + perimeter);
	}

}