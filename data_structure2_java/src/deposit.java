public class deposit {

    static void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit must be more than 0");
        }

        System.out.println("Deposited " + amount);
    }
 static void main() {
        try {
            deposit(100);
            deposit(-50);
            deposit(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Refused: " + e.getMessage());}
    }
}
