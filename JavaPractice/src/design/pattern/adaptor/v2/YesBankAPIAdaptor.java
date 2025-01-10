package design.pattern.adaptor.V2;

public class YesBankAPIAdaptor implements BankAPI{
    YesBankApi yesBankApi = new YesBankApi();
    @Override
    public int getBalance() {
        return yesBankApi.balanceCheck();
    }

    @Override
    public void transferMoney() {
        yesBankApi.moneyTransfer();
    }
}
