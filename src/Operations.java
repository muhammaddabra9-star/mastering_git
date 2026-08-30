import java.sql.SQLOutput;
import java.util.Scanner;

public class Operations{
    public static void main (String[] args){

//Math methods

      /*  System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;


        result = Math.pow(2,5);
        result = Math.abs(-9);
        result = Math.sqrt(16);
        result = Math.round(2.75);
        result = Math.ceil(5.2);
        result = Math.floor(8.77);
        result = Math.max(90,100);
        result = Math.min(67,56);



        System.out.println(result); */


// HYPOTENUSE C= Math.sqrt(a2 +  b2)


      /*  Scanner scanner= new Scanner(System.in);
        double a;
        double b;
        double c;

         System.out.println("Enter the length of side A");
         a = scanner.nextDouble();

         System.out.println("Enter the lenght of side B");
         b = scanner.nextDouble();

         c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

         System.out.println("the hypotenuse of side c: is " + c);*/

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

/*  Direct calculation and No storage of result

        Scanner scanner= new Scanner(System.in);
double radius ;

System.out.println("Enter the value of the radius");
radius= scanner.nextDouble();

System.out.println("the circumference is going to be: " + (2 *Math.PI*radius));
System.out.println("the area of the circle is :" +Math.PI*Math.pow(radius,2));
System.out.println("the volume is "+ (4.0/3.0)*Math.PI*Math.pow(radius,3));*/

//storage of result

        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

System.out.println(" Enter value of the radius ");
radius = scanner.nextDouble();

circumference= 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("the circumference is:  %.2f\n ",circumference);
        System.out.printf("the area is:  %.2f\n  ", area);
        System.out.printf("the volume is :  %.2f\n " ,volume);



        scanner.close();


    }

        }
