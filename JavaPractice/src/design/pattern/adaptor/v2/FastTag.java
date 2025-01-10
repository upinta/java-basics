package design.pattern.adaptor.V2;

import design.pattern.adaptor.V2.BankAPI;

public class FastTag {
    public boolean recharge(int amount, BankAPI bankAPI){
        if(bankAPI.getBalance() >= amount) {
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
