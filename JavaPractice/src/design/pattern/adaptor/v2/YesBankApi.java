package design.pattern.adaptor.V2;

public class YesBankApi {
    public int balanceCheck(){
        return 100;
    }

    public void moneyTransfer(){
        System.out.println("Money transferred via YesBank");
    }
}
