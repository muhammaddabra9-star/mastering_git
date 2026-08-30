//Company Payroll Application
//  BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class represents an employee who receives
// a base salary in addition to commission.


public class BasePlusCommissionEmployee {

    private final String firstname;
    private final String lastname;
    private final String socialSecurityNumber;
    private double commissionRate;
    private double totalSales;
    private double  baseSalary;
// six-argument constructor
    public  BasePlusCommissionEmployee(String firstname,String lastname,String socialSecurityNumber,double commissionRate,double totalSales,double baseSalary) {

        // implicit call to Object's default constructor occurs here

        // if totalSales is invalid throw exception
        if (totalSales<0)
        throw new IllegalArgumentException("Total Sales must be >= 0.0");

        // if commissionRate is invalid throw an exception
  if (commissionRate <= 0.00 || commissionRate >= 1.00)
throw new IllegalArgumentException("CommissionRate must be >0 and <1");

// if base salary is invalid throw exception
        if (baseSalary <0.0)
        throw new IllegalArgumentException(" Base Salary must be greater than 0 unless if totalSales is 0.0");

        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;

    } // end of constructor

    //return firstname


    public String getFirstname() {
        return firstname;

    }
    public String getLastname(){
        return lastname;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

//setting totalSales amount
    public void setTotalSales(double totalSales) {
        if (totalSales < 0)
        throw new IllegalArgumentException("Total Sales must be >= 0.0 ");

        this.totalSales = totalSales;
    }
        //returning total sales amount

        public double getTotalSales () {
            return totalSales;
        }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate<0 || commissionRate>1)
            throw new IllegalArgumentException("Commission Rate must be >0 and <1 ");
        this.commissionRate = commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<=0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }
    //returning base salary
    public double getBaseSalary(){
        return baseSalary;
    }

    public double earnings(){
        return baseSalary + (commissionRate*totalSales);
    }
    //return String representation of BasePlusCommissionEmployee
    @Override public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n","based-salaried Commissionemployee",firstname,lastname,"social security number",socialSecurityNumber,"Total  sales",totalSales,"commission rate",commissionRate,"base salary",baseSalary);

    }




}//end class BasePlusCommissionEmployee

