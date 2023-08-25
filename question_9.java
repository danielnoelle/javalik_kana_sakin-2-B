import java.util.Scanner;

public class question_9 {
    
    public static void main(String[] args){

        System.out.println("Enter the value of a: ");
        
        Scanner scanner = new Scanner(System.in);

        int a_value = scanner.nextInt();

        System.out.println("Enter the value of b: ");

        int b_value = scanner.nextInt();

        int a = a_value;
        int b = b_value;

        boolean less = a < 50;
        boolean lesser = a < b;

        System.out.println(less);
        System.out.println(lesser);

        scanner.close();
    }
}
