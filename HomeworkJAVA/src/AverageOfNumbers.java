import java.util.Scanner;

public class AverageOfNumbers  // class name
{


    {
        Scanner aveofnum = new Scanner(System.in); //object create new object

        System.out.println("Enter first numbers"); //print this line
        double num1 = aveofnum.nextDouble(); //user input numbers
        System.out.println("Enter second numbers"); //print this line
        double num2 = aveofnum.nextDouble(); //user input numbers
        System.out.println("Enter third numbers"); //
        double num3 = aveofnum.nextDouble();
        System.out.println("Enter forth numbers");
        double num4 = aveofnum.nextDouble();
        System.out.println("Enter fifth numbers");
        double num5 = aveofnum.nextDouble();
        System.out.println("Average equals to:" + " " + (num1 + num2 + num3 + num4 + num5) / (5));// condition for average


    }

}