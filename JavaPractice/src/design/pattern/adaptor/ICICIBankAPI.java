package design.pattern.adaptor;

public class ICICIBankAPI {
    public int checkBalance(){
        return 100;
    }

    public void transfer(){
        System.out.println("Transferred via ICICI Bank");
    }
}
