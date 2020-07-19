import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {
        // 미리 생성해둔 사전 파일명입니다.
        String dictionaryFile = "src/dictionary.txt";

        // 파일로부터 사전 데이터를 읽어 HashMap 으로 만듭니다.
        // 상세한 구현은 뒷쪽에 정의된 readDictionary 메소드로 정의했습니다.
        Map<String, String> dictionary = readDictionary(dictionaryFile);

        // 사용자로부터 번역할 단어를 입력받기 위해 Scanner 를 생성합니다.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 이 반복문은 사용자로부터 문자열을 입력받은 키로
            // HashMap(dictionary)에서 데이터를 가져다가 출력해줍니다.
            System.out.println("번역할 영단어를 입력하세요.(종료: 빈 줄로 엔터)");

            // 사용자로부터 문자열을 입력받습니다.
            String englishWord = scanner.nextLine();

            // 사용자가 빈 문자열을 입력했다면 반복문을 탈출합니다.
            if (englishWord.equals("")) {
                break;
            }

            if (dictionary.containsKey(englishWord)) {
                // HashMap(dictionary) 에 영단어를 키로 하는 한국어 단어가 있다면
                // 한국어 단어를 출력해줍니다.
                String koreanWord = dictionary.get(englishWord);
                System.out.println(englishWord + " 은(는) " + koreanWord + " 입니다.");
            } else {
                // HashMap(dictionary) 에 영단어를 키로 하는 한국어 단어가 없다면
                // 사전에 단어가 없다는 메세지를 출력해줍니다.
                System.out.println("사전에서 단어를 찾을 수 없습니다.");
            }
        }
    }

    public static Map<String, String> readDictionary(String fileName) {
        // 파일로부터 읽어온 단어 데이터를 담을 HashMap 을 생성합니다.
        Map<String, String> dictionary = new HashMap<>();

        // 사전 파일을 읽기 위해 FileInputStream 을 선언합니다.
        FileInputStream inputStream = null;

        try {
            // fileName 으로부터 FileInputStream 을 생성합니다.
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않는 경우 메세지 출력 후 프로그램을 종료합니다.
            System.out.println("사전 파일이 존재하지 않습니다.");
            System.exit(20);
        }

        // 파일로부터 내용을 읽어오기 위해 Scanner 를 생성합니다.
        Scanner scanner = new Scanner(inputStream);

        // 파일의 내용을 끝까지 읽기 위한 반복문입니다.
        while (scanner.hasNextLine()) {
            // next() 를 호출해 그 줄의 첫 단어(영단어)를 읽어옵니다.
            String englishWord = scanner.next();
            // 다시 한번 next() 를 호출해 그 줄의 두번째 단어(한글 단어)를 읽어옵니다.
            String koreanWord = scanner.next();

            // HashMap 에 영단어를 키로, 한글 단어를 값으로 입력합니다.
            dictionary.put(englishWord, koreanWord);
        }

        // 파일의 끝까지 읽어 단어를 추가했다면 이 HashMap 을 반환합니다.
        return dictionary;
    }
}
