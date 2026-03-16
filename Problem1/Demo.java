package Problem1;
public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 25, "M");
        
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS4567123", 3.8);
        
        Teacher mrJava = new Teacher("Duke Java", 34, "M", 55000, "Computer Science");

        CollegeStudent ima = new CollegeStudent(
            "Ima Frosh", 
            18, "F",
            "IF456", 
            4.0, 
            2, 
            "English");

            System.out.println(bob);
            System.out.println(lynne);
            System.out.println(mrJava);
            System.out.println(ima);
            
        }
}
