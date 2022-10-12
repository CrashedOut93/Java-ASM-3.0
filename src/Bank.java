public class Bank {
    int amount = 200;
    int balance = 1000;
    int newBalance = 0;

    public static int Deposit(int amount, int balance, int newBalance){
        return newBalance = amount + balance;
    }

    public static int Withdraw(int amount, int balance, int newBalance){
        return newBalance = amount - balance;
    }

}
