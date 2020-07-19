import java.util.Scanner;

public class MethodCallWhithinMethod01 {

    public static void main(String[] args) {
        calculate(); // calculate 메소드를 호출합니다.
    }

    public static void calculate() {
        // 사용자의 입력을 받기 위한 Scanner를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 연산을 선택하세요.");
        System.out.println("1: 덧셈");
        System.out.println("2: 곱셈");
        System.out.println("그 외: 종료");

        // 원하는 연산의 번호를 문자열 타입으로 입력받습니다.
        String input = scanner.nextLine();

        // 연산을 수행하기를 원하는 첫 번째 숫자를 입력받습니다.
        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = scanner.nextInt();

        // 연산을 수행하기를 원하는 두 번째 숫자를 입력받습니다.
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = scanner.nextInt();

        // 만일 덧셈을 선택했다면
        // 덧셈을 위해 sum 메소드를 호출하고 그 결과값을 출력합니다.
        if (input.equals("1")) {
            int sum = add(a, b);
            System.out.println(a + " + " + b + " = " + sum);
        }

        // 만일 곱셈을 선택했다면
        // 곱셈을 위해 multiply 메소드를 호출하고 그 결과값을 출력합니다.
        if (input.equals("2")) {
            int product = multiply(a, b);
            System.out.println(a + " x " + b + " = " + product);
        }
    }

    // 덧셈을 수행해 결과값을 반환하는 메소드입니다.
    public static int add(int a, int b) {
        System.out.println("덧셈을 수행합니다.");
        return a + b;
    }

    // 곱셈을 수행해 결과값을 반환하는 메소드입니다.
    public static int multiply(int a, int b) {
        System.out.println("곱셈을 수행합니다.");
        return a * b;
    }
}
