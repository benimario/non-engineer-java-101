import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput01 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
            System.exit(10);
        }

        Scanner scanner = new Scanner(inputStream);
        String line = scanner.nextLine();
        System.out.println(line);
        String line2 = scanner.nextLine();
    }
}





