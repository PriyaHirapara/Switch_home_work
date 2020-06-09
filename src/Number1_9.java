import java.util.Scanner;

public class Number1_9 { // class nme
    public static void main(String args[] ){ // main method

        Scanner scanner = new Scanner(System.in); // creat an object for scanner class
        System.out.print(" please enter any number from 0 to 9 :  ");
         int number = scanner.nextInt(); // stode variable into intiger

         switch (number) {
             case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: // if user enter case 0 to case 9 it says that is number
                 System.out.println("That number is : " + number);
                 break;
             default: // if user enter other number than masseg comes that number is not allowed
                 System.out.println("That number is not allowed");

         }
    }
}

