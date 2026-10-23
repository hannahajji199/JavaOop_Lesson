public class withdraw {
    static double balance = 200;

    static void withdrawing(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }

        balance -= amount;
    }

    public static void main(String[] args) {
        try {
            withdrawing(500);
        } catch (Exception e) {
            System.out.println("Refused: " + e.getMessage());
        }

        System.out.println("Back to main menu");
    }
}
