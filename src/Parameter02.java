import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parameter02 {

    public static void main(String[] args) {
        readTextFile("src/output03.txt");
        readTextFile("src/output04.txt");
    }

    public static void readTextFile(String fileName) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}



