public class AtmException {
    // ATM
    public static void main(String[] args) {
        String input = "50o";

        try {
            int amount = Integer.parseInt(input);
            System.out.println("Withdrawing " + amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount." +e.getMessage());
        }

        System.out.println("Back to main menu");



        // extra example student marks
        String marksInput = "8o";   // lecturer typed letter o instead of 0
        try {
            int marks = Integer.parseInt(marksInput);
            System.out.println("Marks saved: " + marks);
        } catch (NumberFormatException e) {
            System.out.println("Marks must be a number");
        }
        System.out.println("Back to student menu");


        // array index
        int[] scores = {70, 85, 90};
        try {
            System.out.println(scores[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no score at that position");
        }

    }
}
