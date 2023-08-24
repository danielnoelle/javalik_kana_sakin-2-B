import java.util.Scanner;

public class question_6 {
    
    public static void main(String[] args) {

        Scanner square = new Scanner(System.in);
        System.out.println("Enter side of the square: ");
        int number ;

        number = square.nextInt();

        int square_root = number * number;

        System.out.println("The square of the number " + number + " is " + square_root);

        square.close();
    }
}
