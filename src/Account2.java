//Account.java
//Account class that contains a name instance variable(i.e a name attribute)
//And methods to set and get its value.

public class Account2 {
    private String name ;  // instance variable/field
    public void setName(String name )// Method to set the name in the  object
    {
        this.name = name;  //Store the name

    }

public String getName()//method to retrieve the name from the object
{
return name; //return value of name to caller
}

}