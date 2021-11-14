public class testStatic {
    static float price1 = 50.50F, price2 = 75.25F;
    static float  total(){
        return (price1 + price2) - 25;
    }
    public static void main(String[] args) {
        System.out.println("Hello: "+"$"+ testStatic.total());
    }
}
