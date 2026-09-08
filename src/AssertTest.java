import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueloop = true; //determines if more input is needed
        do {



               try {
                      System.out.println("Enter a number between 0 and 10");
                      int number = input.nextInt();

    //asserting that the value is >=0 and <=10
    //assert (number >=0 && number <=10 ): "bad number "+ number;
    // System.out.printf("You entered %d%n",number);
                               if (number < 0 || number > 10) {
                              throw new IllegalArgumentException("Validation failed: bad number " + number);
    }

                                       System.out.printf("You entered %d%n", number);

 continueloop = true;

                             }catch (IllegalArgumentException IllegalArgumentException){
                       System.err.printf("%nException: %s%n", IllegalArgumentException);
                          System.out.printf("The number must be between 0 and 10. please try again.%n%n");
          }

                }while (continueloop);//end of class AssertTest
}
}