import java.util.Scanner;

public class question_7 {
    
    public static void main(String[] args) {

        System.out.println("Enter the First Word: ");

        Scanner word_one = new Scanner(System.in);
        String First_word;
        First_word = word_one.nextLine(); //to initialized the variable

        System.out.println("Enter the Second Word: ");

        Scanner word_two = new Scanner(System.in);
        String Second_word;
        Second_word = word_two.nextLine();

        System.out.print(First_word + Second_word);

        word_one.close();
        word_two.close();
    }
}
