import java.util.Scanner;

public class City_name {
    public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in); // creat an object for scanner class
    System.out.println("please enter any alphbet"); // printing out please enter any alphbet

    String city = scanner.nextLine(); // make class as string

    switch(city) { // city is veriable
        case "a": //if user enter a and printing our below city name
            System.out.println("Ahmedabad");
            break;
        case "b": //if user enter b and printing our below city name
            System.out.println("baroda");
            break;
        case "c": //if user enter c and printing our below city name
            System.out.println("canada");
            break;
        case "d": //if user enter d and printing our below city name
            System.out.println("darby");
            break;
        case "e": //if user enter e and printing our below city name
            System.out.println("englend");
            break;
        default: //if user enter any other alphabet rather than a to e printing our invelid entry
            System.out.println("invelid entry");
    }
}}