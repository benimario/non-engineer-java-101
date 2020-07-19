import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazardInRooms {

    public static void main(String[] args) {
        int[] rooms = {0, 1, 2, 3}; // 방

        String BAT = "Bat";
        String PIT = "Pit";
        String WUMPUS = "Wumpus";
        String NOTHING = "Nothing";

        // 각 방에 배치된 위험요소입니다.
        String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

        // 위험요소에 해당하는 플레이어의 대사입니다.
        HashMap<String, String> hazardMessages = new HashMap<>();

        hazardMessages.put(WUMPUS, "\"어디선가 끔찍한 냄새가 난다.\"");
        hazardMessages.put(BAT, "\"어디선가 부스럭거리는 소리가 들린다.\"");
        hazardMessages.put(PIT, "\"바람이 부는 소리가 들리는 것 같다.\"");
        hazardMessages.put(NOTHING, "\"저 방에는 아무것도 없는 것 같다.\"");

        // 각 방에서 이동할 수 있는 방들의 목록을 표현한 통로입니다.
        int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

        int currentRoom = 0; // 현재 방 번호입니다.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

            // 현재 방에서 갈 수 있는 방들의 목록입니다.
            int[] nextRooms = links[currentRoom];

            // 반복문을 통해 연결된 방들을 순회합니다.
            for (int nextRoom : nextRooms) {
                // 방 번호에 해당하는 위험요소를 가져옵니다.
                String hazard = hazards[nextRoom];
                // 위험요소에 해당하는 대사를 가져옵니다.
                String message = hazardMessages.get(hazard);
                // 대사를 출력합니다.
                System.out.println(message);
            }

            // 현재 방에서의 통로들을 출력합니다.
            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");
            System.out.println(Arrays.toString(nextRooms));

            // 이동해갈 방 번호를 입력받습니다.
            int roomNumber = scanner.nextInt();

            // 입력한 방으로 이동합니다.
            currentRoom = roomNumber;
        }
    }
}
