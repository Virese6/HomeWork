package Wallet;

public class Main {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet(new Money(25, 2));
        Wallet wallet2 = new Wallet(new Money(20, 22));
        Wallet wallet3 = new Wallet(new Money(10, 12));
        System.out.println(wallet1);
        System.out.println(wallet2);
        System.out.println(wallet3);

    }
}
