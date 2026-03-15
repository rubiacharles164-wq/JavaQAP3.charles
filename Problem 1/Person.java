public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender; //M for male F for female

    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }
    public String GetName() {
        return myName;
    }
    public int GetAge() {
        return myAge;
    }
    public String GetGender() {
        return myGender;
    }

    public void SetName(String name) {
        this.myName = name;
    }
    public void SetAge(int age) {
        this.myAge = age;
    }
    public void SetGender(String gender) {
        this.myGender = gender;
    }
    
    public String toString() {
        return "Name: " + myName + "\nAge: " + myAge + "\nGender: " + myGender;
    }

}