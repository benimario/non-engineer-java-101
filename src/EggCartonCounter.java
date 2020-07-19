import java.util.Scanner;

public class EggCartonCounter {

    public static void main(String[] args) {
        // 사용자로부터 총 달걀의 수를 입력받기 위한 Scanner 를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("총 달걀의 수를 입력하세요.");

        int eggCartonSize = 30; // 계란판 하나당 포장되는 닫걀 수입니다.
        int totalEggs = 0; // 총 달걀 수를 입력받기 위해 0으로 초기화합니다.

        // 사용자로부터 문자열을 입력받습니다.
        String input = scanner.nextLine();

        try {
            // 사용자가 입력한 문자열을 정수로 변환합니다.
            // 예외가 발생할 수 있으므로 try 영역 안에 작성합니다.
            totalEggs = Integer.parseInt(input);

            if (totalEggs < 30) {
                // 사용자가 입력한 달걀의 수가 30개 미만인 경우 메세지를 출력합니다.
                System.out.println("계란판이 필요하지 않습니다.");
            } else {
                // 사용자가 입력한 달걀의 수가 30개 이상인 경우
                // 포장에 필요한 계란판 수를 계산합니다.
                int totalEggCartons = totalEggs / eggCartonSize;

                System.out.println(
                    "총 " + totalEggCartons + "개의 계란판이 필요합니다."
                );
            }
        } catch (NumberFormatException e) {
            // 사용자가 입력한 문자열을 정수로 변환하는 데 실패한 경우
            // 잘못된 입력이라는 메세지를 출력합니다.
            System.out.println("잘못된 입력입니다.");
        }
    }
}
