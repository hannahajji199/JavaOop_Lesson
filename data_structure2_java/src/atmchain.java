public class atmchain {

        static double balance = 200;

        static void withdraw(double amount) throws Exception {
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
        }

        static void atm(double amount) throws Exception {
            withdraw(amount);
            System.out.println("Please take your cash");
        }

        public static void main(String[] args) {
            try {
                atm(500);
            } catch (Exception e) {
                System.out.println("Refused: " + e.getMessage());
            }

            System.out.println("Back to main menu");
        }

}
