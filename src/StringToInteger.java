import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String intString = scanner.nextLine();
        int number = Integer.parseInt(intString);
        System.out.println("다음 숫자는 " + "500" + "1" + "입니다.");
    }
}


