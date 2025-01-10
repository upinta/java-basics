package design.pattern.adaptor.V2;

import design.pattern.adaptor.V2.BankAPI;
import design.pattern.adaptor.V2.FastTag;
import design.pattern.adaptor.V2.UPI;

public class PhonePay {
    private design.pattern.adaptor.V2.BankAPI bankapi;
    private design.pattern.adaptor.V2.FastTag fastTag;
    private design.pattern.adaptor.V2.UPI upi;
    public PhonePay(BankAPI bankapi) {

    }

    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount, bankapi);
    }

    public boolean UPITransfer(int amount){
        return  upi.recharge(amount, bankapi);
    }
}
