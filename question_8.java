import java.util.Scanner;

public class question_8 {
    
    public static void main(String[] args){

        System.out.println("Enter the first input: ");
        Scanner input_one = new Scanner(System.in);
        int first_input;
        first_input = input_one.nextInt();

        System.out.println("Enter the second input: ");
        Scanner input_two = new Scanner(System.in);
        int cin_input;
        cin_input = input_two.nextInt();

        System.out.println("Enter the third input: ");
        Scanner input_three = new Scanner(System.in);
        int input_input;
        input_input = input_three.nextInt();

        boolean allTrue = first_input == cin_input && first_input == input_input;
        boolean twoEqual = first_input == cin_input || cin_input == input_input || first_input == input_input;

        if(allTrue){
            System.out.println("All inputs are EQUAL");
        }else if(twoEqual){
            System.out.println("Two inputs are EQUAl");
        }else{
            System.out.println("None of the inputs are EQUAL");
        }

        input_one.close();
        input_two.close();
        input_three.close();


    }
}
