import java.io.FileWriter;
import java.io.IOException;

public class FileOutput01 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/output01.txt");
            writer.close();
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }
    }
}




