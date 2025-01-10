package design.pattern.adaptor.v1;

import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        String BankName = sc.nextLine();
        BankAPI b = BankAPIFactory.getBankAPI(BankName);
        PhonePay phonePay = new PhonePay(b);
        phonePay.rechargeFastTag(100);
    }
}
