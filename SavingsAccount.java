package DecoratorPattern;

public class SavingsAccount implements BankAccount
{
    private String accountNumber;
    private String accountName;
    private double balance;

    public SavingsAccount(String accountNumber, String accountName, double balance) //Parameterized Constructor
    {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public SavingsAccount() //NON-Parameterized Constructor
    {
        this.accountNumber = "1234";
        this.accountName = "Juan Dela Cruz";
        this.balance = 10000.0;
    }

    public String showAccountType()
    {
        return "Savings Account";
    }

    public Double getInterestRate()
    {
        return 0.01;
    }

    public Double getBalance()
    {
        return this.balance;
    }

    public String showBenefits()
    {
        return "Standard Savings Account";
    }

    public Double computeBalanceWithInterest()
    {
        return balance *  (1 + this.getInterestRate() );
    }

    public String showInfo()
    {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nBalance: " + this.balance;
    }

    public String setAccountNumber(int accountNumber)
    {
        return "AccountNumber: " + accountNumber;
    }

    public String setAccountName(String accountName)
    {
        return "AccountName: " + accountName;
    }

    public Double setBalance(double balance)
    {
        return balance;
    }
}

