
import java.util.Scanner;

public class Calculator {
    public static void main(String args []) { //main method
        Scanner scanner = new Scanner(System.in); // creat an object from scanner class
        System.out.print("please enter 1st number"); // asking to use enter any number
        int number1 = scanner.nextInt(); // for first number
        System.out.print("please enter 2nd number"); //asking to user enter any number
       int number2 = scanner.nextInt(); // for secont number

        System.out.println("select any operator : +,_,*,/ "); // printing out that

        char choice = scanner.next().charAt(0); // user can make choice
        //String opp = String.valueOf(choice);

        switch (choice) {
            case '+':
                System.out.println("addtition : " +(number1+number2));

                break;
            case '-':
                System.out.println("addition  : " + (number1-number2));
                break;
            case '*':
                System.out.println("mult : " + (number1*number2));
                break;
            case '/':
                System.out.println(" division : " + (number1/number2));
            default:
                System.out.println("wrong choice");
        }
    }

}
