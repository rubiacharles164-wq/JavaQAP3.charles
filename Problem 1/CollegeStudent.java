public class CollegeStudent extends Student {
    protected String year;
    protected String major;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    public String getYear() {
        return year;
    }
    public String getMajor() {
        return major;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
    
}