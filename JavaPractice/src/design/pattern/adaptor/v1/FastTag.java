package design.pattern.adaptor.v1;

public class FastTag {
    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.getBalance() >= amount) {
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
