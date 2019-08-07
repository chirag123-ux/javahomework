import java.util.Scanner;

public class OddEven // class name
{

    public static void main(String[] args) // main method
    {
        Scanner oddeven = new Scanner(System.in); // object create new object
        System.out.println("Enter first number"); // print this line
        int num1 = oddeven.nextInt(); // user needs input value
        System.out.println((num1 % 2 == 0) ? "This is Even number" : "This is Odd number"); // condition true or false


        System.out.println("Enter second number"); // print this line
        int num2 = oddeven.nextInt(); // user needs input value
        System.out.println((num2 % 2 == 0) ? "This is Even number" : "This is Odd number"); //condition true or false

    }

}