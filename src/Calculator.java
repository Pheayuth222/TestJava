public class Calculator {
    double height1, height2;
    Calculator(){
        height1 =1.68;
        height2 = 1.73;
        double total = height1 + height2;
        System.out.println(total);
    }

    public static void main(String[] args) {
        new Calculator();
        Calculator cal = new Calculator();
    }
}
