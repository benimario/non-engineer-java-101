import java.util.HashMap;
import java.util.Set;

public class MapLoop01 {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        Set<String> englishWords = dictionary.keySet();

        for (String englishWord : englishWords) {
            String koreanWord = dictionary.get(englishWord);
            System.out.println(englishWord + ": " + koreanWord);
        }
    }
}



