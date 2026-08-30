// company payroll Application
// Gross(total) sale percentage
//Note that commission is the static method of payment  in this program

public class CommissionEmployee  {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    //the above fields(final) is showing that they will never be declared as set methods but get e.g getlastame
    private double totalSales; // Weekly total sales
    private double commissionRate; //commission percentage
    //Five-argument constructor
    public CommissionEmployee(String firstname, String lastName, String socialSecurityNumber,
                              double totalSales, double commissionRate) {
//implicit call to object's default constructor occurs here


        //if gross sales is invalid throw  exception
        // this is only for field classes that are quantified
        if (totalSales < 0.0)
            throw new IllegalArgumentException("Total sales must be >= 0.0");
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1)
            throw new IllegalArgumentException(
                    "Commision rate must be > 0.0 and <1.0");


        this.firstName = firstname;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;

    }

    //end of constructor
    //returning first name
    public String getFirstName() {
        return firstName;
    }

    //return lastName
    public String getLastName()

    {
        return lastName;
    }
    //return socialSecurityNumber
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    //set total sales amount

    public void setTotalSales(double totalSales) {
        if (totalSales < 0.0)
                     throw new IllegalArgumentException(
                           "total sales must be >= 0.0");
        this.totalSales = (double) totalSales;
    }

        public double getTotalSales(){
        return totalSales;
    }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
                   throw new IllegalArgumentException(
                          "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }


    // calculate earnings
    public double earnings()
    {
        return commissionRate * totalSales;
    }
//public double newearnings(){return setTotalSales() * setCommissionRate()}


    //CALCULATING EARNINGS
    // return String representation of CommissionEmployee object
    // indicates that this method overrides a super method
    //why do   we need this part what does it do? // Ok we could say its for set methods
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,

                "social security number", socialSecurityNumber, "total sales", totalSales,
                "commission rate", commissionRate);
    }

}


