import java.util.Scanner;

public class Week_day {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in); // creat an object for scanner class
        System.out.println("please enter any number"); // printing out please enter any number
         int days = scanner.nextInt();

         switch (days) { //order is days
             case 1: // if user enter 1 than week start form sunday and printing out sunday
                 System.out.println("sunday");
             break;
             case 2: //if user enter 2 than week start form sunday and printing out monday
                 System.out.println("Monday");
              break;
             case 3: //if user enter 3 than week start form sunday and printing out Tuseday
                 System.out.println("Tuseday");
             break;
             case 4: //if user enter 4 than week start form sunday and printing out wednesday
                 System.out.println("wednesday");
             break;
             case 5: //if user enter 5 than week start form sunday and printing out thuseday
                 System.out.println("thuseday");
             break;
             case 6: //if user enter 6 than week start form sunday and printing out friday
                 System.out.println("friday");
             break;
             case 7: //if user enter 7 than week start form sunday and printing out saturday
                 System.out.println("saturday");
             default: // if user enter anything else than printing out invalid choice
                 System.out.println("invalid choice");
         }
    }
}
