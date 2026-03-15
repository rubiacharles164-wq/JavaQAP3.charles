public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    public String getIdNum() {
        return getIdNum;
    }
     public String getGPA() {
        return getGPA;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }
    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }
    
    public String toString() {
        return super.toString() + "\nID Number: " + myIdNum + "\nGPA: " + myGPA;
    }
}