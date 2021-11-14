public class testMethod {
    private String per1, per2;
    void nameGet() {
        per1 = "Yuth";
        per2 = "Fight";
        String totalPerson = per1 +"  "+ per2;
        System.out.println(totalPerson);
    }

    public static void main(String[] args) {
        new testMethod();
        testMethod p = new testMethod();
        p.nameGet();
    }
}
