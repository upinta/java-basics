package design.pattern.adaptor.v1;

public class IcicBankAPI implements BankAPI{
    @Override
    public int getBalance() {
        return 100;
    }

    @Override
    public void transferMoney() {
        System.out.println("transfer money");
    }
}
