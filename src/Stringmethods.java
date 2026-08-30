import java.util.Scanner;

public class Stringmethods {
    public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

        String name = " Ya muhammad";
 String Password = "@jp127";

        int length = name.length();
        char letter = name.charAt(3);
int index = name.indexOf("h");
int lastindex = name.lastIndexOf("m");
//name = name.replace("a","o");

name = name.trim();


//name = name.toUpperCase();
//name = name.toLowerCase();
 //name.isEmpty();
/*
if (name.isEmpty()){
    System.out.println("Your name is empty");
}else {
    System.out.println("Your name is  "+name);
}
if (name.contains(" ")) {
    System.out.println("Your name contains spaces");

}else {
    System.out.println("Your name doesn't contain space");
}
if (name.equalsIgnoreCase("password")) {
    System.out.println("Your name can't be password");
}else {
    System.out.println(" your name is " + name);
} */
        System.out.println("Insert your password");
        String pasword = scanner.nextLine();
        if (pasword.equals(Password)){
            System.out.println("Access Given");
        } else {
            System.out.println("Access denied");
        }


        System.out.println();

   //      Lee Boynton, Arthur van Hoff, Martin Buchholz, Ulf Zibis
scanner.close();





    }
}
