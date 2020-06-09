import java.util.Scanner;

public class Vowel_cons {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in); // creat an object for scanner class
        System.out.print("pleas enter any alphbets ");
        String alpha = scanner.next();

        switch (alpha){
            case "a": case "e": case "i": case "o": case "u":
                System.out.println("alphabet is vowel ");
                break;
            default:
                System.out.println(" alphabet is consonant ");
        }
    }

}
