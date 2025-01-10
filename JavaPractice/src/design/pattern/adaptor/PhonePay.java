package design.pattern.adaptor;

import design.pattern.adaptor.FastTag;
import design.pattern.adaptor.UPI;
import design.pattern.adaptor.YesBankAPI;

import java.util.Objects;

public class PhonePay {
    private FastTag fastTag;
    private UPI upi;
    private YesBankAPI yesBankAPI;

    public PhonePay() {
        this.upi = new UPI();
        this.fastTag = new FastTag();
        this.yesBankAPI = new YesBankAPI();

    }

    public boolean rechargeFastTag(int amount){
      return fastTag.transfer(amount,yesBankAPI);
    }

    public boolean UPITransfer(int amount){
        return upi.transfer(amount, yesBankAPI);
    }
}
