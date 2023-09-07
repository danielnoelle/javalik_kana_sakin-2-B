import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int year, num, month, days;
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		boolean doLoop = true;
		String answer;

		System.out.println("How Many Days Are There?");
		System.out.println("\n");

		while (doLoop) {

			System.out.print("RUN or STOP?: ");
			answer = scnr.nextLine();

			if (answer.equals("RUN")) {
				try {
					System.out.print("\nEnter a month: ");
					num = scnr.nextInt();

					if (num > 12 && num < 1) {
						System.out.println("\nThere are only 12 months in a year.");
						scnr.nextLine();
						System.out.println("Please try again." + "\n");
						continue;
					}

					System.out.print("Enter a year: ");
					year = scnr.nextInt();

					num -= 1;

					if (months[num] == months[0]) {
						days = 31;
						System.out.println("\n" + months[0] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[1]) {
						if (isLeapYear(year) == true) {
							days = 29;
						} else {
							days = 28;
						}
						System.out.println("\n" + months[1] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[2]) {
						days = 31;
						System.out.println("\n" + months[2] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[3]) {
						days = 30;
						System.out.println("\n" + months[3] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[4]) {
						days = 31;
						System.out.println("\n" + months[4] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[5]) {
						days = 30;
						System.out.println("\n" + months[5] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[6]) {
						days = 31;
						System.out.println("\n" + months[6] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[7]) {
						days = 31;
						System.out.println("\n" + months[7] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[8]) {
						days = 30;
						System.out.println("\n" + months[8] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[9]) {
						days = 31;
						System.out.println("\n" + months[9] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[10]) {
						days = 30;
						System.out.println("\n" + months[10] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					} else if (months[num] == months[11]) {
						days = 31;
						System.out.println("\n" + months[11] + " " + year + " has " + days + " days." + "\n");
						scnr.nextLine();

					}
				} catch (InputMismatchException e) {
					System.out.println("\nThat is not a number.");
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