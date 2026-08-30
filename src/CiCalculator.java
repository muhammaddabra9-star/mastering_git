import java.util.Scanner;

public class CiCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal ;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate: ( in %)");
        rate =  scanner.nextDouble() / 100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the years: ");
        years = scanner.nextInt();

       //  A  = p[1+(r/n)]^nt or A = principal * Math.pow([1+(r/n)],nt)

      amount = principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);
       // System.out.println("The amount after " + years + " is: $ " + amount);

        System.out.printf("the amount after %d years is %.2f " ,years ,amount);

      scanner.close();
     }

     }
