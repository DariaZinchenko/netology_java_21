public class MoneyTransfer {
    public static void main (String[] args) {
        int currentBalance = 2_000_000_000;
        int moneyTransfer = 147_483_648;
        int finalBalance = currentBalance + moneyTransfer;

        System.out.println("currentBalance = " + currentBalance);
        System.out.println("moneyTransfer = " + moneyTransfer);
        System.out.println("finalBalance = currentBalance + moneyTransfer = " + finalBalance);
    }
}
