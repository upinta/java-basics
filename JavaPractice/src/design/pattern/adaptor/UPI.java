package design.pattern.adaptor;

public class UPI {
    public boolean transfer(int amount, YesBankAPI yesBankAPI) {
        if(yesBankAPI.balanceCheck() >= amount) {
            System.out.println("UPI transfer successful");
            return true;
        }
        return false;
    }
}
