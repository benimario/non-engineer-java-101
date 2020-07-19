import java.util.Arrays;
import java.util.Scanner;

public class RoomsInCave {

    public static void main(String[] args) {
        // 4개의 방입니다.
        int[] rooms = {0, 1, 2, 3};

        // 각 방에서 이동할 수 있는 방들의 목록을 표현한 통로입니다.
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

        int currentRoom = 0; // 현재 방 번호입니다.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");

            // 현재 방에서의 통로들을 출력합니다.
            System.out.println(Arrays.toString(links[currentRoom]));

            // 이동해갈 방 번호를 입력받습니다.
            int roomNumber = scanner.nextInt();

            // 입력한 방으로 이동합니다.
            currentRoom = roomNumber;
        }
    }
}
