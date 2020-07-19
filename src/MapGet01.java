import java.util.HashMap;
import java.util.Scanner;

public class MapGet01 {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        Scanner scanner = new Scanner(System.in);
        System.out.println("번역을 원하는 영단어를 입력하세요.");

        String englishWord = scanner.nextLine();

        String koreanWord = dictionary.get(englishWord);

        if(koreanWord == null) {
            System.out.println("사전에 존재하지 않는 단어입니다.");
        } else {
            System.out
                .println(englishWord + "는 \"" + koreanWord + "\"입니다.");
        }
    }
}



