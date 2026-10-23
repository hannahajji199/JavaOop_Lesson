public class Gpa {
    static void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException(
                    "GPA must be between 0.0 and 4.0");
        }

        System.out.println("GPA set to " + gpa);
    }

    public static void main(String[] args) {
        try {
            setGpa(3.6);
            setGpa(4.5);
            setGpa(2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Refused: " + e.getMessage());
        }
    }
}
