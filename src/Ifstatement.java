

//Make sure to come and organise the items here like that of bro codes
// the  Sring,int and boolean come first and then the Sout's




import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //GROUP 1
        String name;
        System.out.println("Enter your name");
        name = scanner.nextLine();

        if (name.isEmpty()){
            System.out.println("You haven't entered your name yet");
        }else {
            System.out.println("hello  " +name + "!");
        }



//GROUP 2
System.out.println("how old are you?");
        int age ;
        age =scanner.nextInt();

          if (age==22) {
            System.out.println("You should have start earning a recognizable amount considering your age by now and if not make sure to find a job to do or learn a skill");
        } else if (age <0) {
            System.out.println("You are not born yet");

        } else if (age >60 ) {
              System.out.println("You are a seniour citizen!");
          } else  if (age >= 18) {
            System.out.println("You are an adult!");


    }else{
            System.out.println("You ara a minor!");
    }
          //GROUP 3
        System.out.println("Are you a student true /false");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent){
            System.out.println("ENROLLMENT STATUS: he is eigible");


        }else {
            System.out.println("he is not eligible");
        }

          scanner.close();
}}
