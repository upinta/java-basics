package design.pattern.adaptor.V2;

public class ICICIBankAPIAdaptor implements BankAPI{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int getBalance() {
        return iciciBankAPI.checkBalance();
    }

    @Override
    public void transferMoney() {
        iciciBankAPI.transfer();
    }
}
