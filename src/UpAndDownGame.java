import java.util.Random;
import java.util.Scanner;

public class UpAndDownGame {

    public static void main(String[] args) {
        System.out.println("지금부터 0-255 사이에서 숫자를 하나 뽑겠습니다.");
        System.out.println("여러분은 제가 뽑은 숫자를 맞춰야합니다.");

        // 0~256 사이의 숫자 중 임의의 숫자 하나를 선택합니다.
        Random random = new Random();
        int randomNumber = random.nextInt(256);

        // 플레이어로부터 숫자 입력을 받기 위한 Scanner 를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 중괄호 블록 안의 8회 반복합니다.
        for (int i = 0; i < 8; i = i + 1) {
            // 플레이어에게 알려주기 위해 현재 남은 시도 횟수를 출력합니다.
            // i 는 0부터 7까지 증가하기 때문에 8 - i로
            // 현재 남은 횟수를 알아낼 수 있습니다.
            System.out.println(8 - i + "번의 기회가 있습니다.");

            // 플레이어로부터 숫자를 입력받습니다.
            // 코드를 단순하게 만들어 이해를 돕기 위해 예외 처리는 하지 않았습니다.
            System.out.println("추측한 숫자를 입력하세요.");
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input);

            if (randomNumber == guess) {
                // 만일 입의의 숫자와 플레이어가 입력한 숫자가 일치한다면
                // 축하 메세지를 출력한 후 반복문을 탈출합니다.
                System.out.println("짝짝짝. 정답입니다.");
                break;
            }

            else if (randomNumber < guess) {
                // 만일 임의의 숫자가 플레이어가 입력한 숫자보다 작다면
                // 작다는 메세지를 출력합니다.
                System.out.println("제가 생각한 숫자가 더 작습니다.");
            } else {
                // 만일 임의의 숫자가 플레이어가 입력한 숫자보다 크다면
                // 크다는 메세지를 출력합니다.
                System.out.println("제가 생각한 숫자가 더 큽니다.");
            }

            // i가 7까지 왔다면 더이상 기회가 없으므로 게임에서 지게 됩니다.
            if (i == 7) {
                System.out.println("더이상 기회가 남지 않았습니다.");
            }
        }

        // 게임 종료 메세지를 출력합니다.
        System.out.println("게임을 종료합니다.");
    }
}
