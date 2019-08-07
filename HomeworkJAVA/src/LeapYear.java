import java.util.Scanner;

public class LeapYear { // class name
    public static void main(String[] args) { //main method
        Scanner leapyear = new Scanner(System.in); // object create new object
        System.out.println("Enter any year"); // print this line in console
        int year = leapyear.nextInt(); // user need to write year
        if (year % 4 == 0) // condition for leapyear
        {
            System.out.println(year + " is a leapyear ."); // condition true
        }
           else
               {
            System.out.println(year + " is not a leapyear ."); // condition false
        }

    }
}