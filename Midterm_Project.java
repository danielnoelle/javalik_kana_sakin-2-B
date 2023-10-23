package oOP.midterm;

import java.util.*; // It allows us to access all the classes and utilities within the java.util package.

public class Midterm_Project {

	private static double balance = 0; // It represents the balance of currently logged in user.
	private static int choice = 0; // It represents the choice of the user. It is used in switch statements.
	private static int userCount = 0; // Represents the users
	private static final int MAX_USERS = 20; // Maximum number of users
	private static String[][] userCredentials = new String[MAX_USERS][2];
	private static Map<String, Double> balanceOfUsers = new HashMap<>(); // Stores the balance of every users with their
	// corresponding username.
	private static String username, password, answer; // It stores the user name, password, and answer of the user. The
	// answer variable is used for decision-making.
	private static Scanner scan = new Scanner(System.in);
	private static final int LOGIN_OPTION = 1; // Log-in option
	private static final int SIGNUP_OPTION = 2; // Signup option
	private static final int EXIT_OPTION = 3; // Exit option

	public static void main(String[] args) {

		System.out.println("\n                                       - ATM - "); // It prints the ATM header.
		System.out.println();

		// Loops infinitely so that user could repeat the program as they want.
		// The "logInMenu" is a label that can be used to control where the "break" and
		// "continue" statements' jump.
		logInMenu:
		while (true) {
			displayLoginOptionMenu(); // Displays the log-in menu.
			System.out.print("\nEnter your choice here: ");

			// This is an example of exception handling.
			// The "try" block contains statements that may throw an exception.
			// If an exception is thrown, the corresponding "catch" block catches it,
			// allowing you to handle the exception gracefully and continue execution.
			// The caught exception object is stored in the variable "e".
			// The "catch" block handles an exception of type "InputMismatchException,"
			// which occurs when the user input does not match the expected data type of the
			// variable.
			try {
				choice = scan.nextInt(); // Takes the user input to be used in switch statement below.
				scan.nextLine();
				clearConsole();
			} catch (InputMismatchException e) {
				System.out.println("\nInput is not present among the choices. Please try again"); // Runs if an exception is thrown by "try" block.
				scan.nextLine(); // Consumes the newline character left by previous input methods.
				continue; // Jumps back to the loop.
			}

			switch (choice) {
			case LOGIN_OPTION: // Executes if the user's choice matches the value of LOGIN_OPTION (which is 1).

				clearConsole(); // Calls the clearConsole method for clearing the terminal
				login(); // Calls the login method

				break;
			case SIGNUP_OPTION:

				clearConsole();
				signUp(); // Calls the signUp method, obviously

				break;
			case EXIT_OPTION:
				System.out.print("\nAre you sure?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", ""); // Replaces all whitespaces into an empty character.

				if (answer.equalsIgnoreCase("Y")) {
					clearConsole();
					break logInMenu; // Breaks from the while loop above which has a label 'logInMenu'
				} else {
					continue;
				}
			default:
				System.out.println("\nInput is not present among the choices. Please try again"); // If the "choice" variable
				// doesn't meet the value of the cases above,
				// the program prints it out.
				continue; // Jumps back to the loop.
			}

		}

		// These are displayed when the user wishes to exit the program.
		clearConsole();
		System.out.println("Thank you for using our program. \nHave a good day!");

	}

	public static void signUp() {

		while (true) { // For constant looping
			if (userCount < MAX_USERS) { // Runs the code block if the userCount variable is less than MAX_USERS.
				System.out.print("Enter your username: ");
				username = scan.nextLine();
				System.out.print("Enter your password: ");
				password = scan.nextLine();

				if (isUsernameTaken(username)) { // If the username is taken, it prevents the user to use that same
					// username.
					System.out.println("\nUsername is taken. Please try again.");
					System.out.println();
					continue; // Restarts the loop
				} else {
					userCredentials[userCount][0] = username; // Stores the username to the first index of the second
					// dimension of the array using the value of the
					// userCount variable;
					userCredentials[userCount][1] = password; // Stores the username to the last index of the second
					// dimension of the array using the value of the
					// userCount variable;
					userCount++; // Iterates the variable.

					System.out.println("\nRegistered successfully. \nPlease proceed to login.");
					balanceOfUsers.put(username, 0.0); // Puts the data to the balanceOfUsers map.
					return; // Terminates the method
				}
			} else {
				System.out.println("\nSystem in maintenance. Please try again later."); // This is shown when the limit
				// of users is reached.
				return;
			}
		}
	}

	public static void login() {

		System.out.print("Enter your username: ");
		username = scan.nextLine();
		System.out.print("Enter your password: ");
		password = scan.nextLine();

		for (int i = 0; i < userCount; i++) { // Loops through each indices of the array.
			if (userCredentials[i][0].equals(username) && userCredentials[i][1].equals(password)) { // If the username
				// and password are
				// found and equals
				// to the value of
				// the indices of
				// first dimension
				// using the value
				// of i, allows the
				// user to login.
				System.out.println("\nLogin successful.");
				getATM(); // Executes the getATM() method.
				return; // Exits the method once the user returns from the getATM() method.
			}
		}

		System.out.println(
			"\nLogin failed. \nPlease check your username and password. \nSign up first if you don't have an account."); // Failed
		// login
		// notice.

	}

	public static boolean isUsernameTaken(String username) { // Validates if the username is taken or nah.
		for (int i = 0; i < userCount; i++) { // Loops the array
			if (userCredentials[i][0] != null && userCredentials[i][0].equals(username)) // If the i value of the index
				// of the first dimension of
				// the array is not null and
				// if that index's value is
				// equals to username, it
				// returns true which means
				// the username is taken.
				return true;
		}
		return false; // Returns false if the username is not taken
	}

	public static void displayLoginOptionMenu() {

		// Method for displaying the menu

		System.out.println("\nSelect from the choices below: ");
		System.out.println("__________*()*__________");
		System.out.println("|                      |");
		System.out.println("| 1 - Login            |\n| 2 - Sign Up          |\n| 3 - Exit             |");
		System.out.println("------------------------");

	}

	public static void getATM() {

		balance = balanceOfUsers.getOrDefault(username, 0.0); // When the method is ran, the balance of the user is
		// retrieved from the map and stores it to balance
		// variable.
		ArrayList<String> transactionHistory = new ArrayList<>();        // This list holds the data of recent transactions of the user.

		accountMenu:
		while (true) { // Constant looping with label for loop-jumping.

			System.out.println();
			System.out.println("Current User: " + username); // Displays the active user.

			displayAccountMenu(); // Runs the method for displaying the menu.
			System.out.print("Enter your choice here: ");

			// Error handling
			try {
				choice = scan.nextInt();
				scan.nextLine(); // Consumes new line from the input stream.
			} catch (InputMismatchException e) {
				System.out.println("\nInput is not present among the choices. Please try again");
				scan.nextLine(); // Consumes new line from the input stream.
				continue;
			}

			switch (choice) { // Switches the value of the choice variable.
			case 1:
				System.out.println("\nDeposit Amount?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					depositMoney(transactionHistory);
				} else {
					continue;
				}
				break;
			case 2:
			
			    if (balance < 100) {
			        // If the user has a balance less than 100PHP, 
			        // prevents the user to perform an operation.
			        clearConsole();
			        System.out.println("\nBalance is below 100PHP. \nPlease deposit first.");
			        continue;
			    }
			    
				System.out.println("\nWithdraw Amount?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					withdrawMoney(transactionHistory);
				} else {
					continue;
				}
				break;
			case 3:
				checkBalance();
				break;
			case 4:
			    
			    if (balance < 100) {
			        clearConsole();
			        System.out.println("\nBalance is below 100PHP. \nPlease deposit first.");
			        continue;
			    }
			    
				System.out.println("\nSend Money?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					transferMoney(transactionHistory);
				} else {
					continue;
				}
				break;
			case 5:
				System.out.println("\nView Transactions?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					viewTransactionHistory(transactionHistory);
				} else {
					continue;
				}
				break;
			case 6:
				System.out.println("\nChange PIN?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					changePin(username);
				} else {
					continue;
				}
				break;
			case 7:
				System.out.print("\nAre you sure?");
				System.out.print("Y/N: ");
				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					clearConsole();
					break accountMenu;
				} else {
					continue;
				}
			default:
				System.out.println("\nInput is not present among the choices. Please try again");
				continue;
			}
		}

	}

	public static void displayAccountMenu() {

		// Method for displaying menu for the users to choose which operation/s they want to perform.

		System.out.println("\nWhat would you like to do? ");
		System.out.println("__________*()*_____________");
		System.out.println("|                         |");
		System.out.println(
			"| 1 - Deposit             |\n| 2 - Withdraw            |\n| 3 - Check Balance       | \n| 4 - Send Money          |\n| 5 - View Transactions   |\n| 6 - Change PIN          |\n| 7 - Log Out             |");
		System.out.println("---------------------------");

	}

	public static void depositMoney(ArrayList<String> transactionHistory) { // The method has an array list parameter
		// it is used for storing the operations the user performed.

		double amount = 0; // Used to store user input which is then added to the balance of the user.

		while (true) {
			clearConsole();
			System.out.print("Minimum amount to deposit is 100PHP. \nEnter amount to deposit: ");

			try {
				amount = scan.nextDouble();
				scan.nextLine();

				if (amount < 100) { // If amount entered is less than 100, prevents the user to perform an operation.
					System.out.println("\nIvalid input amount! Please try again.");
					System.out.println();
					continue; // Restarts the loop
				} else {
					break; // Breaks the loop
				}

			} catch (InputMismatchException e) {
				System.out.println("\nIvalid input amount! Please try again.");
				System.out.println();
				scan.nextLine();
				continue;
			}
		}

		balance += amount; // Adding the amount to the user's balance.
		balanceOfUsers.put(username, balance); // Adds the user to the hashmap using 'put()' since the username
		// is fixed for now, and it's a straightforward way to add a new entry.

		transactionHistory.add("Deposit: " + amount);
		// Adds the transaction to the list with concatenated amount variable.

		System.out.println("\nAmount deposited: " + amount);
		// Informs the user of the amount deposited.

	}

	public static void withdrawMoney(ArrayList<String> transactionHistory) {

		double amount = 0;

		while (true) {
			clearConsole();
			System.out.print("Minimum amount to withdraw is 100PHP. \nEnter amount to withdraw: ");

			try {
				amount = scan.nextDouble();
				scan.nextLine();

				if (amount < 100) {
					System.out.println("\nIvalid amount input! Please try again.");
					System.out.println();
					continue;
				} else {
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nIvalid amount input! Please try again.");
				System.out.println();
				scan.nextLine();
				continue;
			}
		}

		balance -= amount;
		// Decreasing the amount from the user's balance
		balanceOfUsers.put(username, balance);
		transactionHistory.add("Withdraw: " + amount);

		System.out.println("\nAmount withdrawn: " + amount);

	}

	public static void checkBalance() { // Displays the balance of the current user.

		clearConsole();
		System.out.println("Your balance: " + balance);

	}

	public static void transferMoney(ArrayList<String> transactionHistory) {
		double amount = 0;
		String target; // It stores the user's target for transferring money.

		clearConsole();

		transferMenu:
		while (true) {
			System.out.print("Enter target's username: ");
			target = scan.nextLine();
			System.out.println();

			boolean isTargetUserNotFound = true;
			// A boolean flag with 'false' as initial value

			for (int i = 0; i < userCount; i++) { // Loops through the array
				if (target.equalsIgnoreCase(userCredentials[i][0])) { // If target user is found, it updates the value of targetUserFound to true.
					isTargetUserNotFound = false;
					break;
				}
			}

			if (isTargetUserNotFound) {
				// Executes if target is not in found.

				System.out.println("\n" + target + " is not found.");
				System.out.print("\nWould you like to try again? \nY if yes: ");

				answer = scan.nextLine();
				answer = answer.replaceAll("\\s", "");

				if (answer.equalsIgnoreCase("Y")) {
					System.out.println();
					continue transferMenu;
				} else {
					break transferMenu;
				}
			}

			if (target.equalsIgnoreCase(userCredentials[getCurrentUserIndex(username)][0])) {
				// Executes if the user sends money to itself.
				System.out.println("\nYou can't send money to yourself. \nPlease try again.");
				System.out.println();
				continue;
			}

			while (true) {

				for (String e : balanceOfUsers.keySet()) {
					// Traverses the keys of balanceOfUsers map.
					// If the target variable matches the e of
					// balanceOfUsers.keySet(), assigns the value of e to target.
					if (target.equalsIgnoreCase(e)) {
						target = e;
						break;
					}
				}

				System.out.print(
					"Minimum amount to send is 100PHP. \nEnter amount to be transferred to " + target + ": ");
				try {
					amount = scan.nextDouble();
					scan.nextLine();

					if (amount < 100) {
						System.out.println("\nInvalid amount input! Please try again.");
						System.out.println();
						continue;
					} else {
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("\nInvalid amount input! Please try again.");
					scan.nextLine();
					System.out.println();
					continue;
				}
			}

			balance -= amount; // Deducts the balance with the value of the amount variable
			double targetBalance = balanceOfUsers.getOrDefault(target, 0.0); // Creates a variable to store the balance of the target
			// using the target as the key
			targetBalance += amount; // Adds the value of amount variable to the targetBalance variable.
			// Updates the balances of each users.
			balanceOfUsers.put(username, balance);
			balanceOfUsers.put(target, targetBalance);
			transactionHistory.add("Sent " + amount + " to " + target + "."); // Adds the transaction to the list.
			System.out.println("\nSuccessful transfer!");
			System.out.println("User selected: " + target);
			System.out.println("Amount transferred: " + amount);
			System.out.println("Balance remaining: " + balance);
			// Informs the user about the operation.

			System.out.print("\nWould you like to transfer to another user? \nY if yes: ");
			answer = scan.nextLine();
			answer = answer.replaceAll("\\s", "");

			if (answer.equalsIgnoreCase("Y")) {
				System.out.println();
				continue transferMenu;
			} else {
				break transferMenu;
			}
		}
	}

	public static void viewTransactionHistory(ArrayList<String> transactionHistory) {

		clearConsole();
		if (transactionHistory.isEmpty()) {
			System.out.println("No transactions yet."); // Displays if the list is empty.
		} else {
			System.out.println("Transaction History:");
			for (String transaction : transactionHistory) {
				// Prints out every transaction.
				System.out.println(transaction);
			}
		}
	}

	public static void changePin(String username) {
		clearConsole();
		System.out.print("Enter your new PIN: ");
		String newPin = scan.nextLine();

		for (int i = 0; i < userCount; i++) {
			// Loops through the array
			if (userCredentials[i][0].equals(username)) {
				// If the value of index i is equal to username, updates
				// the user's password stored in the second dimension
				// of the current index.
				userCredentials[i][1] = newPin;
				System.out.println("\nPIN changed successfully.");
				return;
			}
		}

		System.out.println("\nUser not found. Please try again.");
	}

	public static void clearConsole() {
		try {
			// Get the name of the operating system.
			String os = System.getProperty("os.name").toLowerCase();

			if (os.contains("win")) {
				// If the operating system is Windows:
				// Create a ProcessBuilder for the "cmd" shell, and execute the "cls" command to clear the console.
				ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "cls");
				// Start the process and inherit the input/output streams.
				Process process = processBuilder.inheritIO().start();
				// Wait for the process to finish execution before continuing.
				process.waitFor();
			} else {
				// If the operating system is not Windows (assumed to be a Unix-like system):
				// Create a ProcessBuilder to execute the "clear" command to clear the console.
				ProcessBuilder processBuilder = new ProcessBuilder("clear");
				// Start the process and inherit the input/output streams.
				Process process = processBuilder.inheritIO().start();
				// Wait for the process to finish execution before continuing.
				process.waitFor();
			}
		} catch (Exception e) {
			// If an exception occurs during the execution, catch it.
			// Print an error message with the details of the exception.
			System.out.println("Error clearing the console: " + e.getMessage());
		}
	}


	public static int getCurrentUserIndex(String currentUser) {
		// Takes a string parameter.
		for (int i = 0; i < userCount; i++) {
			// Loops through the array
			if (userCredentials[i][0].equals(currentUser)) {
				// If the currentUser parameter matches the value of
				// i index, it returns the index that matches the parameter.
				return i;
			}
		}
		// Returns -1 if user not found
		return -1;
	}

}
