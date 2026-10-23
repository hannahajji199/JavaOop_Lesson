class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

 public class bankaccountexceptions {
        static void withdraw(double balance, double amount)
                throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            System.out.println("Remaining: " + (balance - amount));
        }

  public static void main(String[] args) {
            try {
                withdraw(200, 500);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
  }
}

