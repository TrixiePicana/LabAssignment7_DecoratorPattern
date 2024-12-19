package DecoratorPattern;

public class GSave implements BankAccountDecorator
{
    private BankAccount bankAccount;

    //Global Variables
    String accountNumber;
    String accountName;
    double balance;

    public GSave(SavingsAccount account)
    {
        accountNumber = "1234";
        accountName = "Juan Dela Cruz";
        balance = 10000.0;
    }

    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    public String showAccountType()
    {
        return "GSave";
    }

    public Double getInterestRate()
    {
        return 0.025;
    }

    public Double getBalance()
    {
        return this.balance;
    }

    public String showBenefits()
    {
        return "Standard Savings Account, GCash Transfer";
    }

    public Double computeBalanceWithInterest()
    {
        return balance * (1 + this.getInterestRate( ) ) ;
    }

    public String showInfo()
    {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nBalance: " + this.balance;
    }
}