package Ex10_Bank_Account;
import java.util.Scanner;

public class Ex10_Bank_Account {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500);

        System.out.println("--------- Bank ---------");
        System.out.println("    1. Balance Inquiry");
        System.out.println("    2. Overdraft Information");
        System.out.println("    3. Deposit");
        System.out.println("    4. Withdraw");
        System.out.println("    5. Pay Bills ");
        System.out.println("    6. Overdraft Usage Status ");
        System.out.println("------------------------");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> System.out.println("Balance: " + account.getBalance());
            default -> System.out.println("Invalid Option");
        }
    }

}
