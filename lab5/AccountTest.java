package lab5;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(7.99);
        System.err.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.err.printf("addind -$1.14 to account1 balance");
        account1.credit(-1.14);
        System.err.printf("account1 balance: $%.2f\n",account1.getBalance());
    }
}
