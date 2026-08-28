package in.my78;

public class UserTest {

    public static void main(String[] args) {
BankAcc account = new BankAcc("123", "Harsh");

account.deposit(100);

        System.out.println(account.withdraw(200));

        account.deposit(100);
        account.withdraw(-40);


    }
}
