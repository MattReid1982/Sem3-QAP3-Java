package Problem1;
class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);

        this.salary = salary;
        this.subject = subject;
    }

    // Getters 
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
