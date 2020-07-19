import java.util.Scanner;

public class PasswordInput02 {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("비밀번호를 입력해주세요.");
            input = scanner.nextLine();
        } while (input.equals(password) != true);

        System.out.println("올바른 비밀번호를 입력했습니다.");
    }
}



