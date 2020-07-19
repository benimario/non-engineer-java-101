import java.util.ArrayList;
import java.util.Scanner;

public class IsEmptyOrNot {

    public static void main(String[] args) {
        System.out.println("추가할 동영상 제목을 입력하세요.(종료: 0)");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> videos = new ArrayList<>();

        while (true) {
            String title = scanner.nextLine();

            if(title.equals("0")) {
                break;
            }

            videos.add(title);
        }

        if (videos.isEmpty()) {
            System.out.println("목록이 비었습니다.");
        } else {
            System.out.println(
                "총 " + videos.size() + "개의 동영상이 등록되었습니다."
            );
        }
    }
}



