package DecoratorPattern;

public interface BankAccountDecorator extends BankAccount   //DecoratorInterface
{
    void setBankAccount(BankAccount bankaccount);
}
