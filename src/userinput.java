import java.util.Scanner;

public class userinput {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
                 String name=  scanner.nextLine();

                       System.out.println("how old are you");
                   Integer age=  scanner.nextInt();

                       System.out.println("Are you a student true /false");
                 boolean isStudent = scanner.nextBoolean();

                       if (isStudent){
                           System.out.println("ENROLLMENT STATUS: he is eigible");


                       }else {
                           System.out.println("he is not eligible");
                       }

 System.out.println(" And by the fact that he is  " +age + " years old");
                       scanner.close();





    }
}
