import java.util.Scanner;

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

	public void setBalance(double balance)
	{
		this.balance = balance;
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

	public void getData()
	{
		System.out.println("ACCOUNT USERNAME: " + firstName + " " + lastName + ".");
		System.out.println("ACCOUNT NUMBER: " + accountNumber + ".");
		System.out.println("ACCOUNT BALANCE: " + balance);
	}
}

public class BankAccount
{
    public static void main(String[] args)
    {
		double balance = 0.00;

		SavingsAccount johnmark = new SavingsAccount();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String fname = scanner.nextLine();
		
		System.out.println("Enter your second name: ");
		String lname = scanner.nextLine();
		
		System.out.println("Enter your phone number: ");
		int accNum = scanner.nextInt();
		System.out.println();
		System.out.println();
		System.out.println();


		johnmark.setFirstName(fname);
		johnmark.setLastName(lname);
		johnmark.setaccountNumber(accNum);
		johnmark.setBalance(balance);

		johnmark.getData();
		scanner.close();
	}
}
