import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장할 문자열을 입력하세요.");

        try {
            FileWriter writer =
                new FileWriter("src/output03.txt");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }
    }
}




