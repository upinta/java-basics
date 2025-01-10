package design.pattern.adaptor.V2;

import design.pattern.adaptor.PhonePay;

import static design.pattern.adaptor.V2.BankAPIFactory.getBankAPI;

public class Client {
    public static void main(String args[]) {
        BankAPI bankapi = BankAPIFactory.getBankAPI("ICICI");
        //PhonePay ph = new PhonePay(bankapi);
    }
}
