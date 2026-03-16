package Problem1;
public class Student extends Person {
    private String myidNum; // Student id number
    private double myGPA; // Grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // calls the Person constructor

        myidNum = idNum;
        myGPA = gpa;
    }

    // Getters
    public String getIdNum() {
        return myidNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setters
    public void setIdNum(String idNum) {
        myidNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", ID: " + myidNum + ", GPA: " + myGPA;
    }
}
