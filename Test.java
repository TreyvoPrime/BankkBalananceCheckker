//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0F);
        account.setAnnualInterestRate(4.5F);
        account.withdraw(2500.0F);
        account.deposit(3000.0F);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterestRate());
        System.out.println("This account was created at " + account.getDateCreated());
    }
}
