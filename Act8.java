import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	public static boolean isConsonant(char letter) {
		if (letter == 'B' || letter == 'b' || letter == 'C' || letter == 'c' || letter == 'D' || letter == 'd' || letter == 'F' || letter == 'f' || letter == 'G' || letter == 'g' || letter == 'H'
				|| letter == 'h' || letter == 'J' || letter == 'j' || letter == 'K' || letter == 'k' || letter == 'L' || letter == 'l' || letter == 'M' || letter == 'm' || letter == 'N' || letter == 'n'
				|| letter == 'P' || letter == 'p' || letter == 'Q' || letter == 'q' || letter == 'R' || letter == 'r' || letter == 'S' || letter == 's' || letter == 'T' || letter == 't' || letter == 'V'
				|| letter == 'v' || letter == 'W' || letter == 'w' || letter == 'X' || letter == 'x' || letter == 'Y' || letter == 'y' || letter == 'Z' || letter == 'z') {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		char letter;
		boolean doLoop = true;
		String answer;

		System.out.println("Vowel or Consonant?");
		System.out.println("\n");

		while (doLoop) {

			System.out.print("RUN or STOP?: ");
			answer = scnr.nextLine();

			if (answer.equals("RUN")) {
				try {
					System.out.print("\nEnter a letter: ");
					letter = scnr.next().charAt(0);

					if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u') {
						System.out.println("\n" + letter + " is a vowel.\n");
						scnr.nextLine();

					} else if (isConsonant(letter) == true) {
						System.out.println("\n" + letter + " is a consonant.\n");
						scnr.nextLine();

					} else {
						System.out.println("\nThat is not a letter.");
						scnr.nextLine();
						System.out.println("Please try again." + "\n");
						continue;
					}

				} catch (InputMismatchException e) {
					System.out.println("\nThat is not a letter.");
					scnr.nextLine();
					System.out.println("Please try again." + "\n");
					continue;
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