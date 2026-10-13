//public class Bank{
//
//        public static void main(String[] args) {
//
//            // Demo usage
//            BankAccount acc = new BankAccount("Alice", 100.0);
//            System.out.println(acc.getOwner() + "'s balance: " + acc.getBalance());
//
//            acc.deposit(50);
//            System.out.println("After deposit: " + acc.getBalance());
//
//            acc.withdraw(30);
//            System.out.println("After withdraw: " + acc.getBalance());
//
//            acc.withdraw(1000);   // triggers insufficient funds rejection
//            acc.deposit(-5);      // triggers invalid deposit rejection
//        }
//    class BankAccount {
//        private String owner;
//        private double balance;      // fully hidden — no way to set it directly
//
//        public BankAccount(String owner, double openingBalance) {
//            this.owner   = owner;
//            this.balance = (openingBalance >= 0) ? openingBalance : 0;
//        }
//
//        // Read-only access — getters, but deliberately NO setBalance()
//        public String getOwner()   { return owner; }
//        public double getBalance() { return balance; }
//
//        // Behaviour, not raw setters — the object guards its own rules
//        public void deposit(double amount) {
//            if (amount > 0) balance += amount;
//            else System.out.println("Rejected: deposit must be positive (" + amount + ")");
//        }
//
//        public void withdraw(double amount) {
//            if (amount <= 0)
//                System.out.println("Rejected: withdrawal must be positive (" + amount + ")");
//            else if (amount > balance)
//                System.out.println("Rejected: insufficient funds (balance " + balance + ")");
//            else
//                balance -= amount;
//        }
//    }
//
//}
//

public class Bank {

    public static void main(String[] args) {

        // Demo usage
        BankAccount acc = new BankAccount("Alice", 100.0);
        System.out.println(acc.getOwner() + "'s balance: " + acc.getBalance());

        acc.deposit(50);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(30);
        System.out.println("After withdraw: " + acc.getBalance());

        acc.withdraw(1000);   // triggers insufficient funds rejection
        acc.deposit(-5);      // triggers invalid deposit rejection
    }

    static class BankAccount {
        private String owner;
        private double balance;      // fully hidden — no way to set it directly

        public BankAccount(String owner, double openingBalance) {
            this.owner   = owner;
            if (openingBalance >= 0) this.balance = openingBalance;
            else this.balance = 0;
        }

        // Read-only access — getters, but deliberately NO setBalance()
        public String getOwner()   { return owner; }
        public double getBalance() { return balance; }

        // Behaviour, not raw setters — the object guards its own rules
        public void deposit(double amount) {
            if (amount > 0) balance += amount;
            else System.out.println("Rejected: deposit must be positive (" + amount + ")");
        }

        public void withdraw(double amount) {
            if (amount <= 0)
                System.out.println("Rejected: withdrawal must be positive (" + amount + ")");
            else if (amount > balance)
                System.out.println("Rejected: insufficient funds (balance " + balance + ")");
            else
                balance -= amount;
        }
    }
}
