import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요.");
        String numberString1 = scanner.nextLine();
        System.out.println("두 번째 수를 입력하세요.");
        String numberString2 = scanner.nextLine();
        try {
            int number1 = Integer.parseInt(numberString1);
            int number2 = Integer.parseInt(numberString2);
            int sum = number1 + number2;
            System.out.println("두 수를 더한 값은 " + sum + "입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 변환하는 동안 오류가 발생했습니다.");
        }
    }
}



