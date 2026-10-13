public class example2 {
    public class Student {
        //instance data
        String name;
        int age;
        String major;
        //static data
        static String university = "JUST";
        static int counter = 0;

        //constructor
        Student(String name, int age, String major) {
          this.name = name;
            this.age = age;
            this.major = major;
            counter++;
        }

        //instance method
        void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Major: " + major);
            System.out.println();
        }
        //static method
        static public void printUnivInfo() {
            System.out.println("Univ Name: " + university);
            System.out.println("Number of students: " + counter);
            System.out.println();
        }


    }
}
public void main() {

}


