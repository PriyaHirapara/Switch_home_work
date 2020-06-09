import java.util.Scanner;

public class Even_odd {
    public static void main (String args []){ // main method
        Scanner scanner = new Scanner(System.in); // creat an object for scanner class
        System.out.println(" please enter any number ");
        int num = scanner.nextInt(); // store user input into intiger variable

        switch (num%2) { // divide any number into 2
            case 0 : // o is even number so if user enter even number than magess come as this is even number
                System.out.println("this is Even number");
                break;
            case 1: // 1 is odd number so if user enter odd number than magess come as this is odd number
                System.out.println( "this is odd number");
        }
    }
}
