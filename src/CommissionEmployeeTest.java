//Company Payroll Application
//  CommissionEmployeeTest.java
// CommissionEmployee class test program

public class CommissionEmployeeTest {


    public  static void main (String[] args) {
        // instantiation of CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Muhammad", "Dabra", "2077-7777'",7000.00,0.80);
        //Note : whereever you call employee ( instantiated object )just like a method call it gives you the values of toString Method from driven class

//get commission employee data
        System.out.println("Employee imformations obtained by get methods;");
System.out.printf( "%n%s %s%n", "First name :",
        employee.getFirstName() );
System.out.printf("%s  %s%n","Last name : ",
employee.getLastName());
System.out.printf("%s %s%n","Social Security Number: ",employee.getSocialSecurityNumber());
System.out.printf("%s %.2f%n","Total sales/week: ",employee.getTotalSales());
System.out.printf("%s %.2f%n"," CommissionRate is :",employee.getCommissionRate()) ;

//double  earning = totalSales * commissionRate;
    //    System.out.printf("%s%s","The employee net earning is",earning);

        employee.earnings();
        System.out.printf("%s %s","The employee total earnings is :",employee.earnings()) ;

    employee.setTotalSales(9000.00);
employee.setCommissionRate(0.20);

        System.out.printf("%n%s:%n%n%s%n",
                      "Updated employee information obtained by toString",employee

        );

       // System.out.printf("%s: %.3f","The new employee total earnings is ",employee.newearnings());
          }
 }

