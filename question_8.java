import java.util.Scanner;

public class question_8 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first input: ");
        int first_input;
        first_input = scanner.nextInt();

        System.out.println("Enter the second input: ");
        int cin_input;
        cin_input = scanner.nextInt();

        System.out.println("Enter the third input: ");
        int input_input;
        input_input = scanner.nextInt();

        boolean allTrue = first_input == cin_input && first_input == input_input;
        boolean twoEqual = first_input == cin_input || cin_input == input_input || first_input == input_input;

        if(allTrue){
            System.out.println("All inputs are EQUAL");
        }else if(twoEqual){
            System.out.println("Two inputs are EQUAl");
        }else{
            System.out.println("None of the inputs are EQUAL");
        }

        scanner.close();
    }
}