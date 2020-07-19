import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + "님, 반갑습니다!");
    }
}



