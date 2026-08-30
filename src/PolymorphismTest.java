
public class PolymorphismTest {
    public static void main(String[] args){
        //assigning subclass reference to subclass variable
        Child1CommissionEmployee child1CommissionEmployee = new Child1CommissionEmployee("Bala","Idi","1234-5678",1000.00,.80,200.00);


        //assigning superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee("Muhammad","Dabra","2077-7777",7000,0.8);


        //invoking toString on superclass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n","Call CommissionEmployee's toString with superclass reference","to superclass object",commissionEmployee);


        //invoking toString on subclass object using subclass object
        System.out.printf("%s %s:%n%n%s%n%n","Call Child1CommissionedEmployee's toString with Subclass ","reference to Subclass object",child1CommissionEmployee);


//invoke toString on subclass object using superclass variable/polymorphism at work
        //i.e taking subclass reference and putting it in superclass variable
        CommissionEmployee commissionEmployee2 = child1CommissionEmployee;
        //invoking String Polymorphically
        System.out.printf("%s  %s%n%n%s%n","Call Child1CommissionEmployee's toString with superclass","reference to subclass object",commissionEmployee2.toString());
    }
}
