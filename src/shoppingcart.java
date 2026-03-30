import java.sql.SQLOutput;
import java.util.Scanner;

public class shoppingcart {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);



        String item;
        int quantity;
        double price;
char currency = '$';

        System.out.println("what item would you like to buy?   hot dog /hamburger");
        item= scanner.nextLine();
        System.out.println("how many would you like to get?");
        quantity= scanner.nextInt();
        System.out.println("how much do you buy each ?  " + currency);
        price= scanner.nextDouble();
        double total = price * quantity;
        System.out.println("Thank you for buying our items your total price is  "+currency+ total);



    }
}
