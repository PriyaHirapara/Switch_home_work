import java.util.Scanner;

public class Rivers_String {
    public static void main(String args[]) { // main method
        String r = reverse("abcdf"); // make string object
        System.out.println(r); //printing out  r
    }
    public static String reverse(String s) { // creat reverse method
        char[] letters = new char[s.length()]; // creat cher as object

        int letterindex = 0; //take int as 0
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterindex] = s.charAt(i);
            letterindex ++;
        }
        String reverse = ""; //convert string reverse
        for (int i=0; i< s.length(); i ++){
            reverse = reverse + letters[i];
        }
        return reverse; // final order to string


    }
}

