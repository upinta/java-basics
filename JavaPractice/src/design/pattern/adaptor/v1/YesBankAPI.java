package design.pattern.adaptor.v1;

public class YesBankAPI implements BankAPI{
    @Override
    public int getBalance() {
        return 100;
    }

    @Override
    public void transferMoney() {
        System.out.println("transfer money");
    }
}
