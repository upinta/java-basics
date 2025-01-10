package design.pattern.adaptor.v1;



public class BankAPIFactory {
    public static BankAPI getBankAPI(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")) {
           return bankAPI = new IcicBankAPI();
        }
            return bankAPI = new YesBankAPI();

    }
}
