public class NestedIf {
    public static void main(String[] args) {
        int age = 15;
        if (age >= 10) {
            if (age < 20) {
                System.out.println("10대");
            } else {
                System.out.println("10대 아님");
            }
        } else {
            System.out.println("10대 아님");
        }
    }
}



