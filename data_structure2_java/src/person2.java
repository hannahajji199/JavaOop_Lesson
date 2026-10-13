class person2 {
    protected String name;
    protected String id;

    public void setDetails(String name ,String id){
        this.name=name ;
        this.id =id;
    }
    public String describe(){

    return "Name :"+name+"( ID :" +id+ ")";
    }
    public static void main() {
// Object 1: Person
        person2 p1 = new person2();
        p1.setDetails("Ahmed", "P101");
        System.out.println(p1.describe());
        System.out.println();

        // Object 2: Student
        student s1 = new student();
        s1.setDetails("Hanan", "S101");
        s1.setGpa(3.8);
        System.out.println(s1.StudentCard());
        System.out.println();
        // Object 3: Lecturer
        lecture l1 = new lecture();
        l1.setDetails("Mohamed", "L101");
        l1.setFaculty("Computer Applications");
        System.out.println(l1.staffCard());
        System.out.println();

        // Object 4: Postgraduate Student
        postgraduatestudent pg1 = new postgraduatestudent();
        pg1.setDetails("Amina", "PG101");
        pg1.setGpa(3.9);
        pg1.setThesisTitle("Data Analysis");
        System.out.println(pg1.postCard());

    }
    }


class student extends person2{
    protected double gpa;
    public void setGpa(double gpa){
        if (gpa>=0 && gpa<=4.0){
            this.gpa=gpa;
        }
    }
    public String StudentCard(){
        return "student : " +"\n" +describe()+ "\n"+"GPA : \n"+gpa;
    }
}
class lecture extends person2{
    private String faculty;
    public void setFaculty(String faculty){
        this.faculty=faculty;
    }
    public  String staffCard(){
        return "lecturer \n" +"Name :" +name+ "ID :"+"\n(" + id + "),\n" +"Faculty :"+faculty;
    }
}
class postgraduatestudent extends student{
    private String thesisTitle;
    public void setThesisTitle(String thesisTitle){
        this.thesisTitle=thesisTitle;
    }
    public String postCard(){
        return "StudentPostGrad \n"+StudentCard()+", thesis: \n " + thesisTitle ;
    }
}
