public class testAbstractClass {
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2();
        System.out.println( cat2.test());
    }
}
abstract class Cat {
    String name = "Kiki";
    int age = 5;
    abstract String test();
}
class Cat2 extends Cat {
    @Override
    String test() {
        return ("Name is: " +name +"\n"+ "Age is: "+ age);
    }
}
