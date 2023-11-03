// package Bank Account(MPESA);

class SavingsAccount
{
    // Attributes
    private String firstName, lastName;
    private int accountNumber;
    private double balance;
    
    // Methods
    SavingsAccount(){}
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }

}

public class BankAccount {
    
}
