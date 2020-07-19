import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLoop03 {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");
        dictionary.put("anteater", "개미핥기");

        Set<Map.Entry<String, String>> wordPairs = dictionary.entrySet();

        for (Map.Entry<String, String> wordPair : wordPairs) {
            String englishWord = wordPair.getKey();
            String koreanWord = wordPair.getValue();

            System.out.println(englishWord + ": " + koreanWord);
        }
    }
}



