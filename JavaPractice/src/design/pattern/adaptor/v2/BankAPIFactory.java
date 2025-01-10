package design.pattern.adaptor.V2;

public class BankAPIFactory {

    public static BankAPI getBankAPI(String Bankname) {
        BankAPI bankAPI = null;
        if(Bankname.equals("ICICI")) {
             bankAPI = new ICICIBankAPIAdaptor();
        } else if (Bankname.equals("YesBank")) {
            bankAPI = new YesBankAPIAdaptor();
        }
        return bankAPI;

    }
}
