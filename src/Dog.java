public class Dog {
    String name = "Kiki";
    private void bark(){
        System.out.println(name + " is barking a person.");
    }
    public static void main(String[] args) {
        // Create an object
        Dog dog = new Dog();
        dog.bark();
    }
}