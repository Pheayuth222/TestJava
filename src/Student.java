public class Student {
    private String name;
    // below is the constructor
    Student(){
        System.out.println("Constructor called");
        name = "Yaya";
    }
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("Student name is: " +st1.name);
    }
}
