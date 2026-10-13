
    // =============================================================
// CA314 · Chapter 2 · Week 1 · Example 1: Bank accounts
// Concepts: extends, IS-A, inherited fields & methods,
//           private vs protected, adding subclass members,
//           hierarchical inheritance, every class extends Object.
// Run:  javac BankAccountDemo.java  &&  java BankAccountDemo
// =============================================================

    // ---------- Superclass: everything the accounts share ----------
    class BankAccount {
        private String accountNumber;      // private: subclasses can't touch it directly
        protected double balance;          // protected: subclasses CAN use it

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        // The rule from Slide 1A, written ONCE for every account type
        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("  Rejected: deposit must be more than 0");
                return;
            }
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    // ---------- Subclass 1: inherits everything, adds one field ----------
    class SavingsAccount extends BankAccount {
        private double minimumBalance = 50;   // only savings accounts have this

        public double getMinimumBalance() {
            return minimumBalance;
        }
    }

    // ---------- Subclass 2: inherits everything, adds one field + one method ----------
    class CurrentAccount extends BankAccount {
        private double overdraftLimit = 200;  // only current accounts have this

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        // A new method that uses the inherited protected field directly
        public double availableFunds() {
            return balance + overdraftLimit;
        }
    }

    // ---------- Driver ----------
    public class Example2 {
        public static void main(String[] args) {
            SavingsAccount savings = new SavingsAccount();
            savings.setAccountNumber("SAV-1001");      // inherited method
            savings.deposit(300);                      // inherited method
            savings.deposit(-20);                      // inherited rule rejects it

            CurrentAccount current = new CurrentAccount();
            current.setAccountNumber("CUR-2001");
            current.deposit(150);

            System.out.println(savings.getAccountNumber() + " balance: " + savings.getBalance()
                    + " (minimum " + savings.getMinimumBalance() + ")");
            System.out.println(current.getAccountNumber() + " balance: " + current.getBalance()
                    + " (available with overdraft " + current.availableFunds() + ")");

            // IS-A checks: a SavingsAccount IS-A BankAccount, and IS-A Object
            System.out.println("savings IS-A BankAccount? " + (savings instanceof BankAccount));
            System.out.println("savings IS-A Object?      " + (savings instanceof Object));

            // savings.accountNumber = "X";   // ERROR if uncommented: accountNumber is private
        }
    }

