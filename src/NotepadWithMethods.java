import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotepadWithMethods {

    // 사용자로부터 입력 처리를 담당할 Scanner를 전역변수로 선언합니다.
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // 무한반복. 사용자가 3을 입력하면 반복문을 탈출하도록 구현합니다.
        while (true) {
            System.out.println("원하는 작업 번호를 입력해주세요.");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            // 사용자로부터 명령 번호를 입력받습니다.
            String operation = scanner.nextLine();
            int taskNum = parseIntegerOrNegative1(operation);

            // 메모 읽기를 선택한 경우
            if (taskNum == 1) {
                System.out.println("메모 파일명을 입력하세요.");

                // 사용자로부터 문자열로 파일명을 입력받습니다.
                String fileName = scanner.nextLine();

                // 사용자가 입력한 파일명으로 된 파일을 읽어 내용을 출력합니다.
                readMemo(fileName);
            }

            // 새 메모를 선택한 경우
            else if(taskNum == 2) {
                System.out.println("저장할 메모 파일명을 입력하세요.");

                // 새 메모를 저장하기 위해 새 파일명을 입력받습니다.
                String fileName = scanner.nextLine();

                // 사용자가 입력한 파일명으로 메모를 작성합니다.
                writeMemo(fileName);
            }

            // 종료를 선택한 경우
            else if (taskNum == 3) {
                // 프로그램을 종료한하는 메세지 출력 후 반복문을 탈출합니다.
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 사용자가 입력한 값이 1, 2, 3 중 하나가 아닌 경우
            // "잘못된 입력입니다"라는 메세지를 출력합니다.
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private static void readMemo(String fileName) {
        // 파일 내용을 읽어들이기 위해 FileInputStream을 선언합니다.
        FileInputStream inputStream = null;

        // 사용자로부터 입력한 파일명을 가지고 FileInputStream을 생성합니다.
        // 파일이 없을 경우 "파일이 존재하지 않습니다."라는 메시지를 출력한 후
        // 그대로 메소드를 탈출합니다.
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        // FileInputStream이 성공적으로 생성되면 안내 메세지를 출력합니다.
        System.out.println(fileName + "의 내용을 출력합니다.");

        // FileInputStream으로부터 파일의 내용을 읽어들일 Scanner를 선언합니다.
        Scanner reader = new Scanner(inputStream);

        // 파일의 내용을 한줄씩 읽어 끝까지 출력합니다.
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        // 파일을 다 사용했으면 닫아줍니다.
        reader.close();
    }

    private static void writeMemo(String fileName) {
        // 파일을 쓰기 위해 FileWriter를 선언합니다.
        FileWriter writer = null;

        // 사용자가 입력한 파일명을 가지고 FileWriter를 생성합니다.
        // 파일 생성에 실패한 경우 "파일 생성에 실패했습니다." 출력 후
        // 반복문의 처음으로 돌아갑니다.
        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            return;
        }

        System.out.println("메모할 문자열을 입력하세요.");
        System.out.println("(종료: 빈 줄에서 엔터키 입력)");

        while (true) {
            // 이 while 문은 반복해서 사용자 입력을 파일에 씁니다.
            // 사용자로부터 문자열을 한줄 입력받습니다.
            String input = scanner.nextLine();

            // 사용자가 입력한 값이 빈 문자열("")이라면 반복문을 탈출합니다.
            if (input.equals("")) {
                break;
            }

            // 사용자가 입력한 문자열을 파일에 쓰고
            // 줄바꿈 문자를 통해 줄바꿈을 추가해줍니다.
            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
            }
        }

        // 빈 문자열을 입력받아 반복문을 탈출했다면 입력이 종료된 것이므로
        // 파일을 닫아줍니다.
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는 데 실패했습니다.");
        }
    }

    public static int parseIntegerOrNegative1(String input) {
        // 문자열을 정수로 변환해 반환합니다.
        // 예외가 발생한 경우(사용자가 정수가 아닌 값 입력) -1 을 반환합니다.
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
