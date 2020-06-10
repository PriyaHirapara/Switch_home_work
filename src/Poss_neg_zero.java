import java.util.Scanner;

public class Poss_neg_zero { // class name
    public static void main(String args[]) { //main method
        Scanner scanner = new Scanner(System.in); // creat object for scanner class
        System.out.println("please enter number "); // printing out  please enter number
        int number = scanner.nextInt(); //int number is

        switch (number >= 0 ? 1 : 0) { //
            case 0:
                System.out.println("your number is negative ");
                break;
            case 1:
                switch (number > 0 ? 1 : 0) {
                    case 0: // if number is 0 than printing out zero
                        System.out.println("your number is zero ");
                        break;
                    case 1: // if number is grether then or equle to 1 than printing out positive
                        System.out.println(" your number is positive");
                        break;
                } } }}

