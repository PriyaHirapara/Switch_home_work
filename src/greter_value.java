import java.util.Scanner;

public class greter_value {
    public static void main(String args[]) { // main methods

        Scanner scanner = new Scanner(System.in); // creat an object for scanner class
        System.out.println("please enter three number"); // printing out please enter three number
        int a = scanner.nextInt(); //print out a value
        int b = scanner.nextInt(); //print out b value
        int c = scanner.nextInt(); //print out c value

        if (a>b && a>c) { // a is greter then b and c
            System.out.println("Greter value is a : " + a); // printing out if a is grether than other
        } else if (b>c) { // b is greter than c
            System.out.println("Grether value is b: " + b); // printing out if b is grether than other
        } else //other
            System.out.println("Grether value is c : " + c); // printing out if c is grether than other
         }
}
