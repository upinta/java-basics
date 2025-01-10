package design.pattern.adaptor.v1;

public class PhonePay {
    private BankAPI bankapi;
    private FastTag fastTag;
    private UPI upi;
    public PhonePay(BankAPI bankapi) {
        this.bankapi = bankapi;
        upi = new UPI();
        fastTag = new FastTag();
    }

    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount, bankapi);
    }

    public boolean UPITransfer(int amount){
        return  upi.recharge(amount, bankapi);
    }
}
