import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = null;

        try {
            writer = new FileWriter("src/output04.txt");
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }

        System.out.println("저장할 문자열을 입력하세요.(종료: 입력 없이 엔터)");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            try {
                writer.write(input);
                writer.write("\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
                System.exit(12);
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는 데 실패했습니다.");
            System.exit(13);
        }
    }
}



