//This class is a child CommissionEmployee
//Private superclass members cannot be accessed in a subclass.

public class Child1CommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // six-argument constructor
    public Child1CommissionEmployee(String firstname, String lastname, String socialSecurityNumber,double totalSales,double commissionRate,double baseSalary) {

//explicit call to superclass Commission Employee constructor
        super(firstname, lastname, socialSecurityNumber, totalSales, commissionRate);

        //if base salary is invalid throw exception
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Base Salary must be >=0");
        this.baseSalary = baseSalary;
    }
        //setting base salary
        public void setBaseSalary(double baseSalary){
            if (baseSalary<0.0)
                throw new IllegalArgumentException();
            this.baseSalary=baseSalary;
        }
        // returning base salary
        public double getBaseSalary()
        {
            return baseSalary;
        }

// calculate earnings
        @Override
                public double earnings()
        //I made my changes here
    {
        return getBaseSalary() + (super.getCommissionRate() *super.getTotalSales());
        // above could also be writeen as below

    }

    // return String representation of Child1CommissionEmployee
        @Override
                public String toString(){

            return String.format("%s %s%n%s: %.2f", "base-salaried",
                    super.toString(), "base salary", getBaseSalary());


        }
    }
  
