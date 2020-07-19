import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 입력하세요.");
        String weightInString = scanner.nextLine();
        try {
            double weight = Double.parseDouble(weightInString);
            double amount = weight * 10;
            System.out.println("권장 급여량은 " + amount + "g입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 변환하는 동안 오류가 발생했습니다.");
        }
    }
}



