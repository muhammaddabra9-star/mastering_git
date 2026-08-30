
 import java.util.Scanner;
//This program prints hello world on the screen.
 //By Muhammad Dabra
 //LAST MODIFIED : June 2026
 /* *
 Javadoc comment
  */
public class HelloWorld
 {
  /*  public static void main( String[] args)
    {
         double age = 55;
             double age2  = 34;
      System.out.print("hello world");
        System.out.print(" this is Java program");
        System.out.println(" or you can say java application. ");
        System.out.println("\"Welcome\ntoJavaProgramming\"");
      //  System.out.println("Welcome to the Ntic grand graduation ceremony");
        System.out.println(age/age2);
 } *


     public static void main(String[] args)
               {
                       // create Scanner to obtain input from command line
                      Scanner input = new Scanner(System.in);

                       int number1; // first number to compare
                      int number2; // second number to compare

                     System.out.print("Enter first integer: "); // prompt
                       number1 = input.nextInt(); // read first number from user

                       System.out.print("Enter second integer: "); // prompt
                      number2 = input.nextInt(); //// read second number from user
                 if (number1 == number2)
                     System.out.printf("%d == %d%n", number1, number2);
                 if (number1 != number2)
                     System.out.printf("%d != %d%n", number1, number2);
                 if (number1 < number2)
                     System.out.printf("%d < %d%n", number1, number2);
                   System.out.printf("%s%n%s%n", "This is a Java", "program");
               }*/
     public static void main (String[] args){
         double height = 15.7;
         System.out.printf("%.2" +
                 "fcm",height );
     }
    }


