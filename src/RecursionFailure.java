public class RecursionFailure {

    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        System.out.println("인셉션을 시도합니다.");
        recursion();
    }
}




