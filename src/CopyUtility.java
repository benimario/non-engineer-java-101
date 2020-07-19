import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyUtility {

    public static void main(String[] args) {
        // 복사할 파일명을 입력받기 위해 Scanner 를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        // 복사할 파일명을 입력받습니다.
        System.out.println("복사할 파일명을 입력하세요.");
        String sourceFileName = scanner.nextLine();

        // 새로 저장할 파일명을 입력받습니다.
        System.out.println("저장할 파일명을 입력하세요.");
        String destinationFileName = scanner.nextLine();

        // 파일을 읽기 위해 FileInputStream 을 선언합니다.
        FileInputStream inputStream = null;
        // 파일을 쓰기 위해 FileWriter 선언
        FileWriter writer = null;

        try {
            // 복사할 파일명(sourceFileName)으로 FileInputStream 을 생성합니다.
            inputStream = new FileInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않는 경우 오류메세지를 출력한 후 종료합니다.
            System.out.println("존재하지 않는 파일입니다. " + sourceFileName);
            System.exit(10);
        }

        try {
            // 새로 저장할 파일명(destinationFileName)으로 FileWriter 를 생성합니다.
            writer = new FileWriter(destinationFileName);
        } catch (IOException e) {
            // 파일 생성에 실패한 경우 오류메세지를 출력한 후 종료합니다.
            System.out.println("파일 생성에 실패했습니다. " + destinationFileName);
            System.exit(11);
        }

        // 파일을 읽기 위해 앞서 생성한 FileInputStream 의 Scanner 를 생성합니다.
        Scanner fileReader = new Scanner(inputStream);

        while (fileReader.hasNextLine()) {
            // 파일에 추가적으로 읽을 내용이 있다면 이 구간을 계속해서 반복합니다.
            // 복사할 파일에서 문자열 한줄을 읽어옵니다.
            String line = fileReader.nextLine();

            try {
                // 새로 저장할 파일에 읽어온 문자열 한줄 쓰고 줄바꿈을 합니다.
                writer.write(line);
                writer.write("\n");
            } catch (IOException e) {
                // 파일에 쓰기가 실패한 경우 오류메세지를 출력한 후 종료합니다.
                System.out.println("파일 쓰기에 실패했습니다. " + destinationFileName);
                System.exit(12);
            }
        }

        // 복사가 끝나면 안내 메세지를 출력합니다.
        System.out.println("파일이 복사되었습니다.");
        System.out.println("원본 파일: " + sourceFileName);
        System.out.println("복제 파일: " + destinationFileName);

        try {
            // 다 사용한 FileWriter 는 닫아줍니다.
            writer.close();
        } catch (IOException e) {
            // 파일 닫기에 실패한 경우 오류메세지를 출력합니다.
            System.out.println("파일을 닫는 중 오류가 발생했습니다.");
        }
    }
}
