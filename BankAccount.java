package DecoratorPattern;

public interface BankAccount    //Component Interface
{
    String showAccountType();

    Double getInterestRate();

    Double getBalance();

    String showBenefits();

    Double computeBalanceWithInterest();

    String showInfo();
}
