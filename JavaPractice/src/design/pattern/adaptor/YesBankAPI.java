package design.pattern.adaptor;

public class YesBankAPI {
    public int balanceCheck() {
        return 100;
    }

    public void moneyTransfer() {
        System.out.println("Money transferred via yesBank API");
    }
}
