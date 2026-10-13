public class person {

    private String name;
    protected int id;

    // Method getting the name
    void setName(String Name) {
        this.name = Name;
        System.out.println("Name  :" + name);
    }
    public String getName() {
        return name;
    }

    void setId(int ID) {
        this.id = ID;
        System.out.println("ID  : " + id);
    }
    public int getId() {
        return id;
    }
    // simple way to get two of them is in one method

    class student extends person {
        private double gpa;

        void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }
    }

    class lecture extends person {
        double salary;

        void setSalary(double Salary) {
            this.salary = Salary;
        }

        public double getSalary() {
            return salary;
        }
    }


    public static void main(String[] args) {

        person p = new person();

        // Student
        student student1 = p.new student();
        System.out.println("Student Info");
        student1.setName("Hanan");
        student1.setId(377);
        student1.setGpa(4.0);
        System.out.println("GPA: " + student1.getGpa());
//
// Lecture
        lecture lecture1 = p.new lecture();
        System.out.println("\nLecture Info");

        lecture1.setName("Ahmed");
        lecture1.setId(3700);
        lecture1.setSalary(1200);
        System.out.println("Salary: " + "$"+lecture1.getSalary());


//

    }
}
