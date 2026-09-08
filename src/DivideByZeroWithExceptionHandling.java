//Handling ArithmeticExceptions and InputMismatchException

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroWithExceptionHandling {
    //demonstarates throwing an exception when a divide by zero occurs

    public static int quotient(int numerator, int denominator)
throws ArithmeticException

    {
return numerator/denominator; // a possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueloop = true; //determines if more input is needed

        do {
            try // read two numbers and calculate quotient// exception could occur here
            {
                System.out.print("please enter an integer numerator");
                int numerator = scanner.nextInt();
                System.out.print("please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d/ %d = %d%n", numerator, denominator, result);
                continueloop = false;//input successful ; end looping
            } catch (InputMismatchException inputMismatchException) {//what to do if exception occurs
                System.err.printf("%nException: %s%n", inputMismatchException);

                scanner.nextLine();//discard input so user can try again
                System.out.printf("You must enter integers . please try again.%n%n");


            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. please try again.%n%n");
            }finally {
                System.err.println("Attempt completed");
            }

        }while (continueloop);

    }
}