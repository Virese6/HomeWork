package Wallet;

public class Money {
    int coin;
    int banknote;

    public Money(int coin, int banknote) {
        this.coin = coin;
        this.banknote = banknote;
    }

    @Override
    public String toString() {
        return "coin = " + coin + ", banknote = " + banknote + ".";
    }
}
