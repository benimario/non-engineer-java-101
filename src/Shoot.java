import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shoot {

    public static int[] rooms = {0, 1, 2, 3}; // 방

    // 각 방에서 이동할 수 있는 방들의 목록을 표현한 통로입니다.
    public static int[][] links = {{1, 2, 3}, {2, 3, 0}, {3, 0, 1}, {0, 1, 2}};

    public static String BAT = "Bat";
    public static String PIT = "Pit";
    public static String WUMPUS = "Wumpus";
    public static String NOTHING = "Nothing";

    // 각 방에 배치된 위험요소입니다.
    public static String[] hazards = {NOTHING, BAT, PIT, WUMPUS};

    public static int currentRoom = 0; // 현재 방 번호입니다.

    public static int arrowCount = 5;

    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

            // 현재 방에서 갈 수 있는 방들의 목록입니다.
            int[] nextRooms = links[currentRoom];

            // 현재 방에서의 통로들을 출력합니다.
            System.out.println("어느 방에 화살을 쏘시겠습니까?");
            System.out.println(Arrays.toString(nextRooms));

            // 화살을 쏠 방 번호를 입력받습니다.
            int roomNumber = scanner.nextInt();

            // 화살 발사 처리 메소드를 호출합니다.
            shoot(roomNumber);
        }
    }

    public static void shoot(int room) {
        // 움퍼스가 있는 방에 화살을 쐈다면 게임 클리어
        if (hazards[room].equals(WUMPUS)) {
            System.out.println("축하합니다. 당신은 움퍼스를 죽였습니다!");
        }

        /*
        화살을 쏜 방이 움퍼스가 있는 방이 아닌 경우
        화살이 다 떨어졌다면 실패 메세지와 함께 게임 플레이를 종료합니다.
        아직 화살이 남아있다면 75%의 확률로 움퍼스를 깨우고
        움퍼스가 이동했다면 움퍼스가 이동한 뒤의 이벤트를 처리합니다.
         */
        else {
            arrowCount = arrowCount - 1;

            if (arrowCount == 0) {
                System.out.println("당신은 움퍼스 사냥에 실패했습니다.");
            }

            else if (random.nextInt(4) != 0) {
                // 플레이어에게 움퍼스가 깨어났음을 먼저 알려줍니다.
                System.out.println("움퍼스가 깨어났습니다.");

                int wumpusRoom = 3;
                int[] nextRooms = links[wumpusRoom];
                // 움퍼스가 있는 방과 연결된 방 중 하나를 랜덤하게 선택합니다.
                int nextRoom = nextRooms[random.nextInt(3)];

                // 선택된 방에 아무 위험요소도 없다면 움퍼스를 이동시킵니다.
                if (hazards[nextRoom].equals(NOTHING)) {
                    hazards[wumpusRoom] = NOTHING;
                    hazards[nextRoom] = WUMPUS;
                    wumpusRoom = nextRoom;
                }
                /*
                움퍼스가 이동해간 방이 플레이어와 같은 방이라면
                플레이어를 잡아먹습니다.
                 */
                if (wumpusRoom == currentRoom) {
                    System.out.println("움퍼스가 당신을 잡아먹었습니다.");
                    System.out.println("당신은 움퍼스 사냥에 실패했습니다.");
                }

                /*
                움퍼스가 이동해갔고 플레이어와 같은 방이 아니라면
                움퍼스가 도망갔다는 메세지를 출력해줍니다.
                 */
                else if (wumpusRoom == nextRoom) {
                    System.out.println("움퍼스가 도망갔습니다.");
                }
            }
        }
    }
}
