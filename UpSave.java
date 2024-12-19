package DecoratorPattern;

public class UpSave implements BankAccountDecorator
{
    private BankAccount bankAccount;

    //Global Variables
    private String accountNumber;
    private String accountName;
    double balance;

    public UpSave(SavingsAccount account)
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
        return "UpSave";
    }

    public Double getInterestRate()
    {
        return 0.04;
    }

    public Double getBalance()
    {
        return this.bankAccount.getBalance();
    }

    public String showBenefits()
    {
        return "Standard Savings Account, With Insurance";
    }

    public Double computeBalanceWithInterest()
    {
        return balance * (1 + this.getInterestRate() );
    }

    public String showInfo()
    {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nBalance: " + this.balance;
    }
}