package design.pattern.adaptor;

public class FastTag {
    public boolean transfer(int amount, YesBankAPI yesBankAPI) {
        if(yesBankAPI.balanceCheck() >= amount) {
            System.out.println("Money transfer via fastTag");
            return true;
        }
        return false;
    }
}
